
package visao;

import controle.TipoContatoControle;
import javax.swing.table.DefaultTableModel;


public class TipoContatoVisao extends FormPadrao{
    
    TipoContatoVisao(){
        setTitle("Tipo de Contato");
        
    }

    @Override
    public void inicializarComponentes() {
       
    }

    TipoContatoControle tcc = new TipoContatoControle();
    
    @Override
    public void salvarVisao() {
        tcc.salvarControle(jtfid.getText(), jtfDescricao.getText() );
    }

    @Override
    public void criarTabela() {
        tabela = utilTabela.criarTabela(
                jpnConsulta,
                new Object[] {60, 650},
                new Object[] {"centro", "esquerda"},
                new Object[] {"ID", "Descricao"}
        );
        modelo = (DefaultTableModel) tabela.getModel();
    }

    @Override
    public void consultaVisao() {
        modelo.setNumRows(0);
        tcc.consultarControle(jtfConsulta.getText(), modelo);
    }

    @Override
    public void atualizarFormulario() {
        jtfid.setText( tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        jtfDescricao.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
    }

    @Override
    public void excluirVisao() {
        tcc.excluirControle(Integer.parseInt(jtfid.getText()));
    }

}

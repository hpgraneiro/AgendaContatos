
package visao;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;


public class BairroVisao extends FormPadrao{
    JLabel jlBairro;
    JComboBox jcbBairro;
    
    BairroVisao(){
        setTitle("Cadastro de Bairro");
        
    }

    @Override
    public void inicializarComponentes() {
        
        jlBairro = new JLabel("Cidade");
        jlBairro.setBounds(20, 60, 50, 25);
        jpnFormulario.add(jlBairro);
        
        jcbBairro = new JComboBox();
        jcbBairro.setBounds(20, 84, 250, 25);
        jpnFormulario.add(jcbBairro);
    }

    @Override
    public void salvarVisao() {
        
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
        
    }

    @Override
    public void atualizarFormulario() {
        
    }

    @Override
    public void excluirVisao() {
        
    }
}

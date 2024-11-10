
package visao;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class CidadeVisao extends FormPadrao{
    JLabel jlUf;
    JLabel jlCep;
    JComboBox jcbUf;
    JTextField jtfCep;
    
    public CidadeVisao(){
        setTitle("Cadastro de Cidade");
        
    }

    @Override
    public void inicializarComponentes() {
        jlUf = new JLabel("UF");
        jlUf.setBounds(20, 60, 50, 25);
        jpnFormulario.add(jlUf);
        
        jcbUf = new JComboBox();
        jcbUf.setBounds(20, 84, 70, 25);
        jpnFormulario.add(jcbUf);
        
        jlCep = new JLabel("CEP");
        jlCep.setBounds(119, 60, 100, 25);
        jpnFormulario.add(jlCep);
        
        jtfCep = new JTextField();
        jtfCep.setBounds(119, 84, 140, 25);
        jpnFormulario.add(jtfCep);
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


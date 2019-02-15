import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Question1 extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JButton bouton1 = new JButton ("Effacer");
	private JTextField texte1 = new JTextField ("Voyer les changements de style", 30);
	private JRadioButton selectNormal = new JRadioButton("Normal");
	private JRadioButton selectGras = new JRadioButton("Gras");
	private JRadioButton selectItalique = new JRadioButton("Italique");
	private JRadioButton selectGrasItalique = new JRadioButton("Gras/Italique");
	private JCheckBox selectTexte = new JCheckBox( "Texte en bleu" );
	
	public Question1(){
		
		super("Atelier 2 - Q1 - Maxime Dery");
		JPanel panneau = new JPanel();
		setSize(400, 100);
		texte1.setSize( 400, 300 );
		panneau.add(texte1);
		panneau.add(selectNormal);
		panneau.add(selectGras);
		panneau.add(selectItalique);
		panneau.add(selectGrasItalique);
		panneau.add(selectTexte);
		panneau.add(bouton1);
		add(panneau);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	}
	
	
	public static void main( String[] args ) {
		
		Question1 fenetre= new Question1();
		fenetre.setVisible(true);
	}

}

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Question2  extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JButton bouton1 = new JButton ("Simon");
	private JButton bouton2 = new JButton ("Erik");
	private JButton bouton3 = new JButton ("Margot");
	private JButton bouton4 = new JButton ("Patrick");
	private JButton bouton5 = new JButton ("Julie");
	private JButton bouton6 = new JButton ("aimerait pratiquer");
	private JButton bouton7 = new JButton ("deteste");
	private JButton bouton8 = new JButton ("pratique");
	private JButton bouton9 = new JButton ("l'escalade");
	private JButton bouton10 = new JButton ("la natation");
	private JButton bouton11 = new JButton ("le ski");
	private JButton bouton12 = new JButton ("la raquette");
	private JButton bouton13 = new JButton ("Nouvelle Phrase");
	private JTextField message = new JTextField(25);
	private JTextArea message2 = new JTextArea("Phrase:");
	private ButtonGroup groupNom = new ButtonGroup();
	private ButtonGroup groupAction = new ButtonGroup();
	private ButtonGroup groupSport = new ButtonGroup();
	
	public Question2(){
		
		super("Atelier 2 - Q2 - Maxime Dery");
		JPanel panneau = new JPanel();
		setSize(400, 300);
		
		
		groupNom.add( bouton1 );
		groupNom.add( bouton2 );
		groupNom.add( bouton3 );
		groupNom.add( bouton4 );
		groupNom.add( bouton5 );
		panneau.add(bouton1);
		panneau.add(bouton2);
		panneau.add(bouton3);
		panneau.add(bouton4);
		panneau.add(bouton5);
		
		groupAction.add( bouton6 );
		groupAction.add( bouton7 );
		groupAction.add( bouton8 );
		panneau.add(bouton6);
		panneau.add(bouton7);
		panneau.add(bouton8);
		
		groupSport.add( bouton9 );
		groupSport.add( bouton10 );
		groupSport.add( bouton11 );
		groupSport.add( bouton12 );
		panneau.add(bouton9);
		panneau.add(bouton10);
		panneau.add(bouton11);
		panneau.add(bouton12);
		
		
		panneau.add(message2);
		panneau.add(message);
		panneau.add(bouton13);
		
		add(panneau);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
		
	public static void main( String[] args ) {
		Question2 fenetre= new Question2();
		fenetre.setVisible(true);

	}

}

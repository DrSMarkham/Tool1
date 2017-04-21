
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.AbstractDocument;
 
//create class and extend with JFrame
public class NewWindow8 extends JFrame  
{
	private JPanel contentPane;//declare variable
	//private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	//main method
	public static void main(String[] args) 
	{
		/* It posts an event (Runnable)at the end of Swings event list and is
		processed after all other GUI events are processed.*/
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				//try - catch block
				//
                            
                            try 
				                             
                                
                            {
					//Create object of NewWindow
				//	NewWindow1 frame = new NewWindow1();
					//set frame visible true
				//	frame.setVisible(false);					
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
 
	/**
	 * Create the frame.
	 */
	public NewWindow8() //constructor
	{
		//set frame title
		//setTitle("Semantic Plan Representation");
		//set default close operation
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//set bounds of the frame
		//setBounds(200, 200, 450, 300);
		
		//create object of JPanel
		//contentPane = new JPanel();
		//set border
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//set ContentPane
		//setContentPane(contentPane);
		//set null
		//contentPane.setLayout(null);
                
                JTextArea textArea = new JTextArea(100, 100);
                
                //JTextArea ta = new JTextArea(100, 100);
    textArea.setText("Use a tuple-based model:\n" +
"(Int start node(of edge), Int end node(of edge), Int number of multiple\n" + 
" edges,Int forward degree of start node(of edge), String action_1, \n" + 
"String action_2,…, String action_( number of multiple edges), *String actor, \n"
+ "*String resource, *String hazard, *String environmental factor, \n" + 
"Empty String,…,Empty String)\n" + "\n" +
"i = start node(of edge) = state i\n" +
"j = end node(of edge) = state j\n" +
"m_ij = number of multiple edges from node i to node j = \n" + 
"number of actions executed simultaneously between state i and state j\n" +
"d_i = forward degree of node i, i.e. the number of (directed) edges leading \n" +
"away from node i\n" +
"action_1 = least priority action executed between nodes (states) i and j\n" +
"action_2 = next least priority action executed between nodes (states) i and j\n" +
".\n" +
".\n" +
"action_m_ij = highest priority action executed between nodes (states) i and j\n" +
"*String actor denotes m_ij tuple entries corresponding to the actors \n" + 
"associated to the m_ij action tuple entities. These String actor tuples are \n" + 
" ordered such that actor tuple entry k+m_ij corresponds to action tuple entry k.\n" +
"Similarly for *String resource, *String hazard and *String environmental factor\n" +
" The individual tuple entries for the actions will be the corresponding \n" + 
"tasking expressions utilising verbs from the J3CIEDM tables \n" + 
"\n" +
" Similarly each corresponding actor, resource, hazard and environmental \n" + 
"factor tuple entry will utilise code from the corresponding J3CIEDM category.\n" + 
"  For example for:\n" +
"•	Actions use “action-task-activity-code”\n" +
"•	Roles use “person-type-category-code”\n" +
"•	Resources use “materiel-type-category-code”\n" +
"•	Hazards use “feature-type-category-code” and “object-type-category-code”\n" +
"•	Environmental Factors use “feature-type-category-code”" + "\n" +
"The user will input the values of j, m_ij, d_i, action_1,…,action_m_ij.\n" +
"For any given node (state) i the value of j will be the i_max +1 where i_max \n" +
" is the maximum number of states recorded already which temporally precede \n" + 
"state j. The tuples will be saved and data extracted from them to calculate \n" + 
"the various plan similarity metrics.");
               // "Semantic Plan Representation Tool\n" + "\n" +
    
                
                
                
                
                //JScrollPane scrollPane = new JScrollPane(textArea);
                JFrame frame = new JFrame("Structural Plan Representation");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //frame.setLayout(new BorderLayout());
                //frame.add(scrollPane);
                frame.setSize(100, 100);
                //frame.setLocationRelativeTo(null);
                //frame.setVisible(true);
		
		//label in the frame
		//JLabel lblWelcome = new JLabel("Welcome this is New Frame");
		//set fore ground color to the label
		//lblWelcome.setForeground(Color.RED);
		//set font to the label
	//lblWelcome.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		//set bounds of the label
		//lblWelcome.setBounds(75, 100, 294, 32);
		//add label to the contentPane 
		//contentPane.add(lblWelcome
                
                //JPanel inputpanel = new JPanel();
                //inputpanel.setLayout(new FlowLayout());
                //JTextField input = new JTextField(20);
                //JButton button = new JButton("Continue");
                //DefaultCaret caret = (DefaultCaret) textArea.getCaret();
                //caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
                //inputpanel.add(scroller);
                //inputpanel.add(input);
                //inputpanel.add(button);
                //contentPane.add(inputpanel);
                //frame.getContentPane().add(BorderLayout.CENTER, contentPane);
                //frame.pack();
                //frame.setLocationByPlatform(true);
                //frame.setVisible(true);
                //frame.setResizable(false);
                //input.requestFocus();
                
                JButton btnNewFrame8 = new JButton("Continue");
		//add actionListener
		btnNewFrame8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				NewWindow10 frame = new NewWindow10();
				frame.setVisible(true);
				//set default close operation
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
                
                btnNewFrame8.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnNewFrame8.setBounds(280, 650, 178, 25);
                
                
                frame.getContentPane().add(textArea);
    //add Button into contentPane
		textArea.add(btnNewFrame8);
                frame.pack();
                frame.setVisible(true);
		((AbstractDocument)textArea.getDocument()).dump(System.out);
    
    
                
                
//public class PlanJavaDON {
  //public static void main(String[] args) {
    //try {
    //    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    //} catch (Exception evt) {}
  
    //JFrame f = new JFrame("Smantic Plan Representation Tool");
    //JTextArea ta = new JTextArea(100, 100);
    //ta.setText(
    //            "Semantic Plan Representation Tool\n" + "\n" +
    
//"logic expression.  Actions can only be performed through rules.\n" + "\n" 
//    );
    //frame.getContentPane().add(ta);
    //contentPane.add(ta);
    //contentPane.pack();
    //contentPane.setVisible(true);

    //((AbstractDocument)ta.getDocument()).dump(System.out);
	}
}






//public TestScrollPane03() {
        //EventQueue.invokeLater(new Runnable() {
            //@Override
            //public void run() {
                
          //  }
        //});
    //} 
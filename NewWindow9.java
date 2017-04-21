
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
public class NewWindow9 extends JFrame  
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
	public NewWindow9() //constructor
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
    textArea.setText("Every plan involves a sequence of actions to be executed \n" +
"over a period of time. To capture and visually represent the temporal context \n" +
"of a plan we will use an acyclic di-graphical model.\n" +
" Nodes represent states including the initial state (1st node) which includes\n" +
"a description of mission objectives. Directed edges represent actions/tasks \n" +
"required to transition between corresponding states (nodes), i.e. they \n" +
"represent causal links. Multiple edges between nodes correspond to distinct \n" +
"actions executed simultaneously and ordered according to increasing priority.\n" +
"Branches, i.e. nodes (other than the ‘root’ of degree >=3 correspond to \n" +
"contingency actions, either pre-planned or ad hoc according to course of \n" +
"action as it is played out. For any given node (state) i the value of j \n" +
"corresponding to the target node (state) will be the i_max +1 where i_max is\n" +
"the maximum number of states recorded already which temporally precede state j.\n" +
" In this sense a plan can be modelled as a state transition system. A state \n" +
"transition system (also called a discrete-event system) is a 3-tuple \n" +
"Σ = (S, A, γ), where S = {s1, s2, s3, …} is a set of states; A = {a1, a2, …} \n" +
"is a set of actions, that is, state transitions whose occurrence is controlled\n" +
"by the plan executor;         γ: S×A→2S is a state-transition function. A \n" +
"state-transition system may be represented by a directed graph whose nodes are\n" +
"the states in S. If s′ ∈ γ (s, e), where e ∈ A is an action, then the graph \n" +
"contains a state transition (that is, an arc) from s to s’ that is labelled \n" +
"with the action e.  If a is an action and γ(s, a) is not empty, then action a\n" +
"is applicable to state s: if the plan executor executes a in state s, this will\n" +
"take the system to some state in γ(s, a).\n" +
"Given a state-transition system Σ, the purpose of planning is to find which \n" +
"actions to apply to which states in order to achieve some objective, when \n" +
"starting from some given situation. A plan is a structure that gives the\n" +
"appropriate actions. The objective can be specified in several different ways.\n" +
"The simplest specification consists of a goal state sg or a set of goal states \n" +
"Sg. The objective is achieved by any sequence of state transitions that ends at\n" +
"one of the goal states. More generally, the objective might be to get the \n" +
"system into certain states, to keep the system away from certain other states,\n" +
"to optimize some utility function, or to perform some collection of tasks. \n" +
" The planner’s input is a planning problem, which includes a description of the\n" +
"system Σ, an initial situation and some objective. The planner’s output is a \n" +
"plan that solves the planning problem. A plan is a sequence of actions that if\n" +
"everything is deterministic, will solve the planning problem P, i.e. the plan,\n" +
"if executed starting at the initial state s1, will take Σ through the sequence \n" +
"of states to reach the goal states.\n" +
" Given the incomplete knowledge and non-deterministic actions that military \n" +
"planners have by necessity to deal with, it doesn’t necessarily follow that on\n" +
"execution, a plan will lead to actualisation of the goal states (objectives).\n" +
" Military plans can have multiple parallel tasks (multiple edges between a pair\n" +
"of nodes) forming part of a linear objective (it all depends upon the mission \n" +
"parameters). A top down analysis of a mission objective would possibly yield a\n" +
"simple linear model but a bottom up analysis of the same objective may require\n" +
"multiple parallel actions to enable the final linear stage completion. It is \n" +
"these enablement actions that can be variable in nature and not clearly defined. \n" +
"This is mainly down the level of accurate intelligence provided at mission \n" +
"briefing. It therefore follows that a level of fluidity is allowed for during\n" +
"operational phase to provide for this. You should therefore never consider the\n" +
"enablement actions to be absolutes as they can be variables.");
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
                
                JButton btnNewFrame9 = new JButton("Continue");
		//add actionListener
		btnNewFrame9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				//call the object of NewWindow and set visible true
				NewWindow8 frame = new NewWindow8();
				frame.setVisible(true);
				//set default close operation
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
                
                btnNewFrame9.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 12));
		//set bounds of the Button
		btnNewFrame9.setBounds(280, 650, 178, 25);
                
                
                frame.getContentPane().add(textArea);
    //add Button into contentPane
		textArea.add(btnNewFrame9);
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
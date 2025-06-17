import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
    
public class TeacherGUI
{
    ArrayList<Teacher> Ary= new ArrayList<Teacher>();
    
    Font font_1= new Font("Dialog",Font.BOLD,19);
    
    private JFrame f1,f2,f3;
    private JPanel p1,p2,p3,p4,p5,p6,p7;
    
    private JLabel l1,l2,l3,l4,l5,l6,l7,l9,l10,l11,l12,l13,l14,l15,
    e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15;
    
    private JTextField t3,t4,t5,t6,t7,t9,t10,t11,t12,t13,t15,t16,
    g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14,g15;
    
    private JButton b1,b2,b3,b4,b6,b7,b8,b11,
    btn2,btn4,btn5,btn6,btn7,btn8,btn9;
    
    
        public void a1(){
        f1 = new JFrame("Sanidhya Kafle");
        f1.setBounds(250,100,550,350);
        
        p1 = new JPanel();
        p1.setBounds(250,100,550,350);
        p1.setLayout(null);
        p1.setBackground(new Color(255, 255, 102));
        
        
            
        l1 = new JLabel("Teacher GUI");
        Font teacherFont = new Font("Arial", Font.BOLD, 35);
        l1.setFont(teacherFont);
        l1.setBounds(160,40,300,40);
        //l1.setFont(font_1);
        p1.add(l1);
    
        b1 = new JButton("Lecturer");
        b1.setBounds(170,100,180,55);
        Font lectureFont = new Font("Arial", Font.BOLD, 20);
        b1.setFont(lectureFont);
        b1.setBackground(new Color(153, 153, 255));
        p1.add(b1);
        
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            Lecturer();
            f1.setVisible(false);
            }
        });
        
        b2 = new JButton("Tutor");
        b2.setBounds(170,180,180,55);
        Font tutorFont = new Font("Arial", Font.BOLD, 20);
        b2.setFont(tutorFont);
        b2.setBackground(new Color(153, 153, 255));
        p1.add(b2);
        
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
            Tutor();
            f1.setVisible(false);
            }
        });
        
        f1.add(p1);
        f1.setVisible(true);
        f1.setBounds(250,100,550,350);
        f1.setResizable(false);
        f1.setLayout(null);
    }
    
    public void Lecturer()
    {
    f2 = new JFrame("Lecturer Info");
    f2.setBounds(180,20,900,620);
        
    p2= new JPanel();
    p2.setBounds(180,40,900,400);
    p2.setBackground(new Color(224,224,224));
    p2.setLayout(null);
    
    l2= new JLabel("Lecturer");
    l2.setBounds(380,5,300,45);
    l2.setFont(font_1);
    p2.add(l2);
    
    b3= new JButton("Go to Tutor>>");
    b3.setBounds(700,8,140,45);
    b3.setBackground(new Color(255, 51, 51));
    p2.add(b3);
    
    b3.addActionListener(new ActionListener()
    {
       public void actionPerformed(ActionEvent e){
            Tutor();
            f2.setVisible(false);
            }
    });
    
    
    
    p3= new JPanel();
    p3.setBounds(10,60,990,230);
    p3.setBackground(new Color(153, 255, 102));
    p3.setLayout(null);
    p2.add(p3);
    
    l3= new JLabel("Teacher Id:");
    l3.setBounds(20,10,120,30);
    p3.add(l3);
    
    t3= new JTextField();
    t3.setBounds(150,10,160,30);
    p3.add(t3);
    
    l4= new JLabel("Teacher Name:");
    l4.setBounds(20,50,120,30);
    p3.add(l4);
    
    t4= new JTextField();
    t4.setBounds(150,50,160,30);
    p3.add(t4);
    
    l5= new JLabel("Teacher Address:");
    l5.setBounds(20,90,120,30);
    p3.add(l5);
        
    t5= new JTextField();
    t5.setBounds(150,90,160,30);
    p3.add(t5);
    
    l6= new JLabel("Years of Experience:");
    l6.setBounds(20,130,120,30);
    p3.add(l6);
        
    t6= new JTextField();
    t6.setBounds(150,130,160,30);
    p3.add(t6);
    
    l7= new JLabel("Department:");
    l7.setBounds(500,10,120,30);
    p3.add(l7);
        
    t7= new JTextField();
    t7.setBounds(630,10,160,30);
    p3.add(t7);
    
    l9= new JLabel("Working Type:");
    l9.setBounds(500,50,120,30);
    p3.add(l9);
        
    t9= new JTextField();
    t9.setBounds(630,50,160,30);
    p3.add(t9);
    
    l10= new JLabel("Employment Status:");
    l10.setBounds(500,90,130,30);
    p3.add(l10);
        
    t10= new JTextField();
    t10.setBounds(630,90,160,30);
    p3.add(t10);
    
    l11= new JLabel("Working Hours:");
    l11.setBounds(500,130,120,30);
    p3.add(l11);
        
    t11= new JTextField();
    t11.setBounds(630,130,160,30);
    p3.add(t11);
    
    
    
    
    
    b11= new JButton("Add Lecturer");
    b11.setBounds(350,170,180,45);
    b11.setBackground(new Color(255, 102, 51));
    //b11.setVisible(false);
    p3.add(b11);
    
    b11.addActionListener(new ActionListener()
    {
       public void actionPerformed(ActionEvent e){
            try
         {
            int id= Integer.parseInt(t3.getText());
            String name= t4.getText();
            String address= t5.getText();
            int yearsOfExperience= Integer.parseInt(t6.getText());
            String department= t7.getText();
            String workingType= t9.getText();
            String employmentStatus= t10.getText();
            int workingHours= Integer.parseInt(t11.getText());
            
            boolean oops=false;
            
            if
            (id <=0 ||address.equals("") || workingType.equals("")|| employmentStatus.equals("")||
              department.equals("")|| name.equals("")|| 
              yearsOfExperience == -1 ||yearsOfExperience ==0||
              workingHours ==-1||workingHours==0 )
            {
                 JOptionPane.showMessageDialog( p2,"Please fill all the fields correctly");
                 return;
            
            }
            else
            {
                if(Ary.isEmpty())
                {
                  oops=true;
                
                }
                else
                {
                    for(Teacher obj: Ary)
                    {
                        if(obj.getTeacherId()== id)
                        {
                             JOptionPane.showMessageDialog( p2,"Teacher ID already exists");
                             oops=false;
                             break;
                        }
                        else
                        {
                            oops=true;
                        }
                    
                    }
                }
            }
                
            if(oops== true)
                {
                Lecturer Lr1= new Lecturer(id,name,address,workingType,employmentStatus,
                department,yearsOfExperience,workingHours);
                
                Ary.add(Lr1);
                JOptionPane.showMessageDialog( p2,"Lecturer Added Sucessfully");
             }
            
        }catch(NumberFormatException nnr)
        {
            JOptionPane.showMessageDialog(p2,"Invalid input...Try Again"); 
        
        }
            }
    });
    
    
    
    p4= new JPanel();
    p4.setBounds(10,295,870,230);
    
    l14= new JLabel("Grade for Assignment");
    l14.setFont(font_1);
    l14.setBounds(320,15,220,30);
    p4.add(l14);
    
    l12= new JLabel("Student Department:");
    l12.setBounds(20,60,120,30);
    p4.add(l12);
    
    t12= new JTextField();
    t12.setBounds(150,60,180,30);
    p4.add(t12);
    
    l13= new JLabel("Student Score:");
    l13.setBounds(500,60,120,30);
    p4.add(l13);
        
    t13= new JTextField();
    t13.setBounds(630,60,180,30);
    p4.add(t13);
    
    l15= new JLabel("Years Of Experience:");
    l15.setBounds(300,120,150,30);
    p4.add(l15);
        
    t15= new JTextField();
    t15.setBounds(430,120,180,30);
    p4.add(t15);
    
    b4= new JButton("Grade Assignments");
    b4.setBounds(350,170,180,45);
    b4.setBackground(new Color(255, 102, 51));
    p4.add(b4);
    
    b4.addActionListener(new ActionListener()
    {
       public void actionPerformed(ActionEvent e){
            try{
                String St_Department= t12.getText();
                int Score= Integer.parseInt(t13.getText());
                int YearsOfExperience= Integer.parseInt(t15.getText());

                if(Score == -1 || Score==0||
                   YearsOfExperience== -1 || YearsOfExperience==0||
                   St_Department.equals("") )
                {
                    JOptionPane.showMessageDialog(p4, "Please properly fill all the fields");
                    return;
                }
                else
                {
                    if (Ary.isEmpty()) {
                    JOptionPane.showMessageDialog(p4, "First of all add Lecturer in the list");
                    return;
                    } 
                        for (Teacher obj:Ary)
                        {
                            if(obj instanceof Lecturer)
                            {
                                Lecturer l1 = (Lecturer) obj;
                                l1.gradeAssignment(Integer.parseInt(t13.getText()),t12.getText(), Integer.parseInt(t15.getText()));
                                JOptionPane.showMessageDialog(p4,"Assignment Graded Successfully");
                            }
                        }
                }
            }catch(NumberFormatException ntr)
            {
            JOptionPane.showMessageDialog(p4,"Invalid Input..Try Again!!");
            }
            }
    });
    
    
    p4.setBackground(new Color(255,255,255));
    p4.setLayout(null);
    p4.setVisible(true);
    p2.add(p4);
    
    b6= new JButton("<<Back");
    b6.setBounds(250,530,140,45);
    b6.setBackground(new Color(255, 255, 0));
    //b6.setFont(font_2);
    p2.add(b6);
    
    b6.addActionListener(new ActionListener()
    {
       public void actionPerformed(ActionEvent e){
            a1();
            f2.setVisible(false);
            }
    });
    
        
    b7= new JButton("Clear All");
    b7.setBounds(400,530,140,45);
    b7.setBackground(new Color(255,255,255));
    //b7.setFont(font_2);
    p2.add(b7);
    
    b7.addActionListener(new ActionListener()
    {
       public void actionPerformed(ActionEvent e){
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t9.setText("");
            t10.setText("");
            t11.setText("");
            t12.setText("");
            t13.setText("");
            t15.setText("");
            }
    });
        
    b8= new JButton("Display");
    b8.setBounds(550,530,140,45);
    b8.setBackground(new Color(26, 255, 255));
    //b8.setFont(font_2);
    p2.add(b8);
    
    b8.addActionListener(new ActionListener()
    {
       public void actionPerformed(ActionEvent e){
            int set=0;
            
            if(Ary.isEmpty())
            {
                JOptionPane.showMessageDialog(p5,"There is No Lecturer in the list");
                set=0;
            }
            else
            {
                for (Teacher dis:Ary)
                {
                    if(dis instanceof Lecturer)
                    {
                        System.out.println("--------------------------------------------------\n");
                        Lecturer disply=(Lecturer) dis;
                        disply.displayDetails();
                        set++;
                        System.out.println("---------------------------------------------------\n");
                }
            }
            
            if (set == 0)
            {
                JOptionPane.showMessageDialog(p5,"No Lecturer Added");
                return;
            }
            else
            {
                String message="";
                for(Teacher dis:Ary)
                {
                    if(dis instanceof Lecturer)
                    {
                        message = "Displayed Successfully";
                        
                    }
                
                }
                JOptionPane.showMessageDialog(p5,message);
                
            
            }
            
            }
            }
    });
    
    
    f2.add(p2);
    f2.setResizable(false);
    f2.setVisible(true);
    f2.setLayout(null);
    }
    
    public void Tutor(){
        f3= new JFrame("Tutor Info");
        f3.setBounds(180,20,900,620);
        
        p5= new JPanel();
        p5.setBounds(180,40,900,620);
        p5.setBackground(new Color(224,224,224));
        p5.setLayout(null);
        
        e1= new JLabel();
        e1.setText("Tutor");
        e1.setBounds(380,5,300,45);
        e1.setFont(font_1);
        p5.add(e1);
        
        btn2= new JButton("Go to Lecturer>>");
        btn2.setBounds(650,8,180,45);
        btn2.setBackground(new Color(255, 51, 51));
        p5.add(btn2);
        
        btn2.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e){
            Lecturer();
            f3.setVisible(false);
            }
        });
        
        p6= new JPanel();
        p6.setBounds(10,60,870,280);
        
        e2= new JLabel("Teacher Id:");
        e2.setBounds(20,10,120,30);
        p6.add(e2);
        
        g2= new JTextField();
        g2.setBounds(150,10,160,30);
        p6.add(g2);
        
        e3= new JLabel("Teacher Name:");
        e3.setBounds(20,50,120,30);
        p6.add(e3);
        
        g3= new JTextField();
        g3.setBounds(150,50,160,30);
        p6.add(g3);
        
        e4= new JLabel("Address:");
        e4.setBounds(20,90,120,30);
        p6.add(e4);
        
        g4= new JTextField();
        g4.setBounds(150,90,160,30);
        p6.add(g4);
        
        
        e5= new JLabel("Qualifications:");
        e5.setBounds(500,90,120,30);
        p6.add(e5);
        
        g5= new JTextField();
        g5.setBounds(630,90,160,30);
        p6.add(g5);

        e6= new JLabel("Specialization:");
        e6.setBounds(20,170,120,30);
        p6.add(e6);
        
        g6= new JTextField();
        g6.setBounds(150,170,160,30);
        p6.add(g6);
        
        e7= new JLabel("Employment Status:");
        e7.setBounds(500,50,120,30);
        p6.add(e7);
        
        g7= new JTextField();
        g7.setBounds(630,50,160,30);
        p6.add(g7);
        
        e8= new JLabel("Performance Index:");
        e8.setBounds(20,130,120,30);
        p6.add(e8);
        
        g8= new JTextField();
        g8.setBounds(150,130,160,30);
        p6.add(g8);
        
        e9= new JLabel("Working Hours:");
        e9.setBounds(500,10,120,30);
        p6.add(e9);
        
        g9= new JTextField();
        g9.setBounds(630,10,160,30);
        p6.add(g9);
        
        e10= new JLabel("Working Type:");
        e10.setBounds(500,130,120,30);
        p6.add(e10);
        
        g10= new JTextField();
        g10.setBounds(630,130,160,30);
        p6.add(g10);
        
        e11= new JLabel("Salary:");
        e11.setBounds(500,170,120,30);
        p6.add(e11);
        
        g11= new JTextField();
        g11.setBounds(630,170,160,30);
        p6.add(g11);
        
        btn4= new JButton("Add Tutor");
        btn4.setBounds(200,220,200,45);
        btn4.setBackground(new Color(255, 102, 51));
        p6.add(btn4);
        
        btn4.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e){
            try{
                int Teacher_Id= Integer.parseInt(g2.getText());
                String Name= g3.getText();
                String Address= g4.getText();
                String Qualifications= g5.getText();
                String Specialization= g6.getText();
                String EmploymentStatus= g7.getText();
                int PerformanceIndex= Integer.parseInt(g8.getText());
                int WHours= Integer.parseInt(g9.getText());
                String WType= g10.getText();
                double Salary= Double.parseDouble(g11.getText());
                boolean red= false;
                
            if
            (Teacher_Id == -1||Teacher_Id == 0 || Name.equals("") || Address.equals("") ||Qualifications.equals("") ||Specialization.equals("") 
            ||EmploymentStatus.equals("") || PerformanceIndex == -1|| PerformanceIndex == 0 ||WHours == -1 ||WHours == 0 || WType.equals("") || Salary == 0 || Salary ==- 1  ) 
            {
                JOptionPane.showMessageDialog(p6, "Please properly fill all the fields ");
                return; 
            }
            else
            {
                if(Ary.isEmpty())
                {
                    red= true;
                }
                   
                else
                {
                     for(Teacher obj:Ary)
                     {
                         if(obj.getTeacherId()==Teacher_Id)
                            {
                                JOptionPane.showMessageDialog(p5,"TeacherID already present");
                                return;
                                
                            }
                            else
                            {
                                red=true;
                            }
                        }
                    }
                            
                }
              if(red== true)
              {
                  Tutor Es= new Tutor(Teacher_Id,Name,Address,WType,EmploymentStatus,WHours,Salary,Specialization,Qualifications,PerformanceIndex);
                  Ary.add(Es);
                  JOptionPane.showMessageDialog(p5, "Tutor added successfully");
              }
              

          } catch(NumberFormatException ltt)
           {
               JOptionPane.showMessageDialog(p5, "Invalid Input.... Try Again!!");
            
           } 
            }
        });
        
        
        
        btn5= new JButton("Remove Tutor");
        btn5.setBounds(450,220,200,45);
        btn5.setBackground(new Color(255, 102, 51));
        p6.add(btn5);
        
        btn5.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e){
            //'b1' is the JTextField where the teacher's ID is entered.
            int teacherId = -1;
            try {
                teacherId = Integer.parseInt(g2.getText().trim());  // Get the ID and trim any white space
            } catch (NumberFormatException bbs) {
                JOptionPane.showMessageDialog(null, "Invalid Teacher ID");
                g2.setText("");  // Clear the input field to avoid confusion
                return;
            }

            boolean found = false;
            for (Teacher t : Ary) {
                if (t instanceof Tutor && t.getTeacherId() == teacherId) {
                    Tutor tutor = (Tutor) t;
                    tutor.removeTutor();  // removeTutor() is a method that resets the tutor's attributes
                    found = true;
                    JOptionPane.showMessageDialog(null, "Tutor details have been removed successfully");
                    break;
                }
            }


            if (!found) {
                JOptionPane.showMessageDialog(null, "No Tutor found with ID: " + teacherId);
            }

            g2.setText("");
            // Clear the field after processing
            }
            });
        
        
        
        
        p6.setBackground(new Color(153, 255, 102));
        p6.setLayout(null);
        p5.add(p6);
        
        p7= new JPanel();
        p7.setBounds(10,290,870,230);
        p7.setBackground(new Color(255,255,255));
        
        e14= new JLabel("Salary and Certification");
        e14.setBounds(320,55,250,30);
        e14.setFont(font_1);
        p7.add(e14);
        
        e12= new JLabel("Enter salary:");
        e12.setBounds(20,100,120,30);
        p7.add(e12);
        
        g12= new JTextField();
        g12.setBounds(150,100,160,30);
        p7.add(g12);
        
        e13= new JLabel("New Performance Index:");
        e13.setBounds(480,100,140,30);
        p7.add(e13);
        
        g13= new JTextField();
        g13.setBounds(630,100,160,30);
        p7.add(g13);
        
        btn6= new JButton("Set Salary");
        btn6.setBounds(320,150,200,45);
        btn6.setBackground(new Color(255, 102, 51));
        p7.add(btn6);
        
        btn6.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e){
            try{
                int NSalary= Integer.parseInt(g12.getText());
                int NPerformanceIndex= Integer.parseInt(g13.getText());

                if(NSalary == -1 || NSalary==0||
                   NPerformanceIndex== -1 || NPerformanceIndex==0
                   )
                {
                    JOptionPane.showMessageDialog(p4, "Please properly fill all the fields");
                    return;
                }
                else
                {
                    if (Ary.isEmpty()) {
                    JOptionPane.showMessageDialog(p7, "First of all add Tutor in the list");
                    return;
                        } 
                        for (Teacher obj:Ary)
                        {
                            if(obj instanceof Tutor)
                            {
                                Tutor t1 = (Tutor) obj;
                                t1.setSalaryAndCertification(Integer.parseInt(g12.getText()),Integer.parseInt(g13.getText()));
                                JOptionPane.showMessageDialog(p4,"Salary set Successfully");
                            }
                        }
                }
            }catch(NumberFormatException ntr)
            {
            JOptionPane.showMessageDialog(p4,"Invalid Input..Try Again!!");
            }
            }
        });
        
        
        p7.setLayout(null);
        p7.setVisible(true);
        p5.add(p7);
        
        
        btn7= new JButton("<<Back");
        btn7.setBounds(250,530,140,45);
        btn7.setBackground(new Color(255, 255, 0));
        //btn7.setFont(font_2);
        p5.add(btn7);
        
        btn7.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e){
            a1();
            f3.setVisible(false);
            }
        });
        
        btn8= new JButton("Clear All");
        btn8.setBounds(400,530,140,45);
        btn8.setBackground(new Color(255,255,255));
        //btn8.setFont(font_2);
        p5.add(btn8);
        
        btn8.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e){
            g2.setText("");
           g3.setText("");
           g4.setText("");
           g5.setText("");
           g6.setText("");
           g7.setText("");
           g8.setText("");
           g9.setText("");
           g10.setText("");
           g11.setText("");
           g12.setText("");
           g13.setText("");
            }
        });
        
        
        btn9= new JButton("Display");
        btn9.setBounds(550,530,140,45);
        btn9.setBackground(new Color(26, 255, 255));
        //btn9.setFont(font_2);
        p5.add(btn9);
        
        btn9.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e){
            int count=0;
            
            if(Ary.isEmpty())
            {
                JOptionPane.showMessageDialog(p5,"No Tutor Added in the list");
                count=0;
            }
            else
            {
                for (Teacher dis:Ary)
                {
                    if(dis instanceof Tutor)
                    {
                        System.out.println("--------------------------------------------------\n");
                        Tutor disply=(Tutor) dis;
                        disply.displayDetails();
                        count++;
                        System.out.println("--------------------------------------------------\n");
                }
            }
            
            if (count==0)
            {
                JOptionPane.showMessageDialog(p5,"No Tutor Added");
                return;
            }
            else
            {
                String message="";
                for(Teacher dis:Ary)
                {
                    if(dis instanceof Tutor)
                    {
                        message = "Displayed Successfully";
                        
                    }
                
                }
                JOptionPane.showMessageDialog(p5,message);
                
            
            }
            
            }
            }
        });
        
        
        f3.add(p5);
        f3.setResizable(false);
        f3.setVisible(true);
        f3.setLayout(null);
    }
    
    
    public static void main(String[]args)
  {
      TeacherGUI trans= new TeacherGUI();
      trans.a1();
     
  }       
}
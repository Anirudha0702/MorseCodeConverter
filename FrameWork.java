import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;

public class FrameWork implements ActionListener
{
	JTextField input,output;
	JButton soundButton,convertButton;
	JFrame frame;
	String details;
	FrameWork()
	{
		
		Font font=new Font("Fixedsys",Font.BOLD,15);
		
		// framer details....
		
		frame =new JFrame("MORSE CODE CONVERTER");
		frame.setSize(600,400);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setFont(font);
		
		// SOUND button details....
		
		soundButton=new JButton("SOUND");
		soundButton.setBounds(400,300,90,50);
		soundButton.setBorder(null);
		soundButton.setBackground(Color.CYAN);
		soundButton.addActionListener(this);
		soundButton.setFocusable(false);
		soundButton.setFont(font);
		
		//CONVERT button details....
		
		convertButton =new JButton("CONVERT");
		convertButton.setFont(font);
		convertButton.setBounds(100,300,90,50);
		convertButton.setBackground(Color.red);
		convertButton.addActionListener(this);
		convertButton.setBorder(null);
		convertButton.setFocusable(false);
		
		// input textField details....
		
		 input=new JTextField();
		input.setBounds(50,50,500,50);
		input.setEditable(true);
		input.setBackground(Color.getHSBColor(267f, 50f, 69f));
		input.setFont(font);
		
		// output textField details....
		
		output=new JTextField();
		output.setBounds(50,200,500,50);
		output.setEditable(false);
		output.setBackground(Color.getHSBColor(163.97f,77.98f,65.88f));
		output.setFont(font);
		
		// adding components to frame......
		
		frame.add(output);
		frame.add(input);
		frame.add(soundButton);
		frame.add(convertButton);
	}
	
	void instantConvert(String string)
	{
		for(int index=0;index<string.length();index++)
		{
			try
			{
				int i;
				FileReader reader=new FileReader("D:/javaMorseCode.txt");
				i=reader.read();
				if(i==-1)
				{
					this.output.setText("Charecter not found in morseCode");
					reader.close();
					System.exit(0);
				
				}
				
				
				else if(string.charAt(index)==' ')
				{
					this.output.setText(this.output.getText().concat("  "));
				}
				
				
				else if(string.charAt(index)=='.')
				{
					this.output.setText(this.output.getText().concat(" .-.-.- "));
				}
				
				
				
				else if(string.charAt(index)=='-')
				{
					this.output.setText(this.output.getText().concat(" -....- "));
				}
				
				
				else if(Character.toUpperCase(string.charAt(index))==(char)i)
				{
					while((char)i !='\n')
					{
						i=reader.read();
						this.output.setText(this.output.getText().concat(String.valueOf((char)i)));
					}
					this.output.setText(this.output.getText().concat(" "));
					reader.close();
				}
				else
				{
					while(Character.toUpperCase(string.charAt(index))!=(char)i)
					{
						i=reader.read();
					}
					while((char)i !='\n')
					{
						i=reader.read();
						this.output.setText(this.output.getText().concat(String.valueOf((char)i)));
					}
					this.output.setText(this.output.getText().concat(" "));
					reader.close();
					
				}
			}
			catch(Exception e)
			{
				this.output.setText("Error occors while converting");
                e.printStackTrace();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		
		
		if(event.getSource()==soundButton)
		{
			String text=this.input.getText();
			try
			{
				for(int i=0;i<text.length();i++)
				{
					if(text.charAt(i)=='.')
					{
						java.awt.Toolkit.getDefaultToolkit().beep();
						this.input.setText("sound going");
					}
				}
			}
			catch(Exception x)
			{
				System.out.print("\n unexpected error occour ");
				x.printStackTrace();
			}
		}
		
	}
}	

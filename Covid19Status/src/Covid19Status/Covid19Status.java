package Covid19Status;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.time.LocalDate;

public class Covid19Status extends JFrame{
	
	private JButton Sub, Bsb, Djb, Dgb, Gjb, Jjb, Usb, Icb ;
	private JLabel title, al, bl, cl, dl;
	LocalDate Today = LocalDate.now();
	private JTextField a,b,c,d ;
	ButtonListener listener = new ButtonListener();

	class Busan extends JFrame {
		public Busan() {
			try (FileReader fr = new FileReader("C:\\Ailiartsua\\COVID19Status\\Busan.txt")) {
				 BufferedReader br = new BufferedReader(fr); 
			      String text= "";
			      
			       while((text = br.readLine()) != null ) {
			    	  JPanel p = new JPanel();
			    	  setTitle("부산 신규 확진자 ");
			    	  add(p);
			    	  JLabel l = new JLabel(text);
			    	  JButton b1 = new JButton("다른 지역 현황 확인하기");
			    	  l.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 15));
			    	  b1.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 13));
			    	  b1.addActionListener(new ActionListener() {
			    		  public void actionPerformed(ActionEvent e)
			    		  {
			    			  dispose();
			    		  }
			    	  });
			    	  p.add(l);
			    	  p.add(b1);
			
			    	  setLocationRelativeTo(null);
			    	  setSize(300,100);
			    	  setVisible(true); 
			       }
			}
			       catch (IOException e) {
			          e.printStackTrace();
				}	
			}
	}
	class Daegu extends JFrame {
		public Daegu() {
			try (FileReader fr = new FileReader("C:\\Ailiartsua\\COVID19Status\\Daegu.txt")) {
				 BufferedReader br = new BufferedReader(fr); 
			      String text= ""; 
			      
			       while((text = br.readLine()) != null ) {
			    	  setTitle("대구 신규 확진자 ");
			    	  JPanel p = new JPanel();
			    	  add(p);
			    	  JLabel l = new JLabel(text);
			    	  JButton b1 = new JButton("다른 지역 현황 확인하기");
			    	  l.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 15));
			    	  b1.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 13));
			    	  b1.addActionListener(new ActionListener() {
			    		  public void actionPerformed(ActionEvent e)
			    		  {
			    			  dispose();
			    		  }
			    	  });
			    	  p.add(l);
			    	  p.add(b1);
			
			    	  setLocationRelativeTo(null);
			    	  setSize(300,100);
			    	  setVisible(true); 
			       }
			}	catch (IOException e) {
			          e.printStackTrace();
				}	
			}
	}
	class Daejeon extends JFrame {
		public Daejeon() {
			try (FileReader fr = new FileReader("C:\\Ailiartsua\\COVID19Status\\Daejeon.txt")) {
				 BufferedReader br = new BufferedReader(fr); 
			      String text= ""; 
			      
			       while((text = br.readLine()) != null ) {
			    	  setTitle("대전 신규 확진자 ");
			    	  JPanel p = new JPanel();
			    	  add(p);
			    	  JLabel l = new JLabel(text);
			    	  JButton b1 = new JButton("다른 지역 현황 확인하기");
			    	  l.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 15));
			    	  b1.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 13));
			    	  b1.addActionListener(new ActionListener() {
			    		  public void actionPerformed(ActionEvent e)
			    		  {
			    			  dispose();
			    		  }
			    	  });
			    	  p.add(l);
			    	  p.add(b1);
			
			    	  setLocationRelativeTo(null);
			    	  setSize(300,100);
			    	  setVisible(true); 
			       }
			}
			       catch (IOException e) {
			          e.printStackTrace();
				}	
			}
	}
	class Gwangju extends JFrame {
		public Gwangju() {
			try (FileReader fr = new FileReader("C:\\Ailiartsua\\COVID19Status\\Gwangju.txt")) {
				 BufferedReader br = new BufferedReader(fr); 
			      String text= ""; 
			      
			       while((text = br.readLine()) != null ) {
			    	  setTitle("광주 신규 확진자 ");
			    	  JPanel p = new JPanel();
			    	  add(p);
			    	  JLabel l = new JLabel(text);
			    	  JButton b1 = new JButton("다른 지역 현황 확인하기");
			    	  l.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 15));
			    	  b1.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 13));
			    	  b1.addActionListener(new ActionListener() {
			    		  public void actionPerformed(ActionEvent e)
			    		  {
			    			  dispose();
			    		  }
			    	  });
			    	  p.add(l);
			    	  p.add(b1);
			
			    	  setLocationRelativeTo(null);
			    	  setSize(300,100);
			    	  setVisible(true); 
			       }
			}
			       catch (IOException e) {
			          e.printStackTrace();
				}	
			}
	}
	class Incheon extends JFrame {
		public Incheon() {
			try (FileReader fr = new FileReader("C:\\Ailiartsua\\COVID19Status\\Incheon.txt")) {
				 BufferedReader br = new BufferedReader(fr);
			      String text= ""; 
			      
			       while((text = br.readLine()) != null ) {
			    	  setTitle("인천 신규 확진자 ");
			    	  JPanel p = new JPanel();
			    	  add(p);
			    	  JLabel l = new JLabel(text);
			    	  JButton b1 = new JButton("다른 지역 현황 확인하기");
			    	  l.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 15));
			    	  b1.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 13));
			    	  b1.addActionListener(new ActionListener() {
			    		  public void actionPerformed(ActionEvent e)
			    		  {
			    			  dispose();
			    		  }
			    	  });
			    	  p.add(l);
			    	  p.add(b1);
			
			    	  setLocationRelativeTo(null);
			    	  setSize(300,100);
			    	  setVisible(true); 
			       }
			}
			       catch (IOException e) {
			          e.printStackTrace();
				}	
			}
	}
	class Jeju extends JFrame {
		public Jeju() {
			try (FileReader fr = new FileReader("C:\\Ailiartsua\\COVID19Status\\Jeju.txt")) {
				 BufferedReader br = new BufferedReader(fr);
			      String text= ""; 
			      
			       while((text = br.readLine()) != null ) {
			    	  setTitle("제주 신규 확진자 ");
			    	  JPanel p = new JPanel();
			    	  add(p);
			    	  JLabel l = new JLabel(text);
			    	  JButton b1 = new JButton("다른 지역 현황 확인하기");
			    	  l.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 15));
			    	  b1.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 13));
			    	  b1.addActionListener(new ActionListener() {
			    		  public void actionPerformed(ActionEvent e)
			    		  {
			    			  dispose();
			    		  }
			    	  });
			    	  p.add(l);
			    	  p.add(b1);
			
			    	  setLocationRelativeTo(null);
			    	  setSize(300,100);
			    	  setVisible(true); 
			       }
			}
			       catch (IOException e) {
			          e.printStackTrace();
				}	
			}
	}
	class Seoul extends JFrame {
		public Seoul() {
			try (FileReader fr = new FileReader("C:\\Ailiartsua\\COVID19Status\\Seoul.txt")) {
				 BufferedReader br = new BufferedReader(fr); 
			      String text= ""; 
			      
			       while((text = br.readLine()) != null ) {
			    	  setTitle("서울 신규 확진자 ");
			    	  JPanel p = new JPanel();
			    	  add(p);
			    	  JLabel l = new JLabel(text);
			    	  JButton b1 = new JButton("다른 지역 현황 확인하기");
			    	  l.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 15));
			    	  b1.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 13));
			    	  b1.addActionListener(new ActionListener() {
			    		  public void actionPerformed(ActionEvent e)
			    		  {
			    			  dispose();
			    		  }
			    	  });
			    	  p.add(l);
			    	  p.add(b1);
			
			    	  setLocationRelativeTo(null);
			    	  setSize(300,100);
			    	  setVisible(true); 
			       }
			}
			       catch (IOException e) {
			          e.printStackTrace();
				}	
			}
	}
	class Ulsan extends JFrame {
		public Ulsan() {
			try (FileReader fr = new FileReader("C:\\Ailiartsua\\COVID19Status\\Ulsan.txt")) {
				 BufferedReader br = new BufferedReader(fr); 
			      String text= ""; 
			      
			       while((text = br.readLine()) != null ) {
			    	  setTitle("울산 신규 확진자 ");
			    	  JPanel p = new JPanel();
			    	  add(p);
			    	  JLabel l = new JLabel(text);
			    	  JButton b1 = new JButton("다른 지역 현황 확인하기");
			    	  l.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 15));
			    	  b1.setFont(new Font(Font.SANS_SERIF, Font.BOLD , 13));
			    	  b1.addActionListener(new ActionListener() {
			    		  public void actionPerformed(ActionEvent e)
			    		  {
			    			  dispose();
			    		  }
			    	  });
			    	  p.add(l);
			    	  p.add(b1);
			
			    	  setLocationRelativeTo(null);
			    	  setSize(300,100);
			    	  setVisible(true); 
			       }
			}
			       catch (IOException e) {
			          e.printStackTrace();
				}	
			}
	}
	
	public Covid19Status() {
		JFrame frame = new JFrame("일일 국내 코로나 확진자 현황 프로그램");
		frame.setSize(800, 620);
	    
		title = new JLabel("국내 코로나 확진자 광역시별 현황 ("+Today+" 일자 기준)");
		frame.add(title);
		title.setSize(550,20);
		title.setLocation(160,10);
		title.setFont(new Font(Font.SERIF, Font.BOLD , 20));
		
		frame.setLayout(null);
		ImageIcon icon = new ImageIcon("c://Ailiartsua//COVID19Status//SouthKorea.png"); //이미지 아이콘 객체 생성

		//이미지를 실제로 갖고 있는 Image객체 뽑아오기
		Image im = icon.getImage(); //뽑아온 이미지 객체 사이즈를 새롭게 만들기!
		Image im2 = im.getScaledInstance(650, 450, Image.SCALE_DEFAULT);
		//새로 조절된 사이즈의 이미지(im2)를 가지는 ImageIcon 객체를 다시 생성
		ImageIcon icon2 = new ImageIcon(im2);
		JLabel img = new JLabel(icon2);
		frame.add(img);
		img.setBounds(55,35,650,450);
		
		Sub = new JButton("서 울"); 		
		Sub.addActionListener(listener);
		frame.add(Sub);
		Sub.setBounds(40,495, 70, 30);
		Sub.setFont(new Font(Font.SERIF, Font.BOLD , 14));
		
		Icb = new JButton("인 천"); 		
		Icb.addActionListener(listener);
		frame.add(Icb);
		Icb.setBounds(130,495, 70, 30);
		Icb.setFont(new Font(Font.SERIF, Font.BOLD , 14));
		
		Djb = new JButton("대 전"); 		
		Djb.addActionListener(listener);
		frame.add(Djb);
		Djb.setBounds(220,495, 70, 30);
		Djb.setFont(new Font(Font.SERIF, Font.BOLD , 14));
		
		Gjb = new JButton("광 주"); 		
		Gjb.addActionListener(listener);
		frame.add(Gjb);
		Gjb.setBounds(310,495, 70, 30);
		Djb.setFont(new Font(Font.SERIF, Font.BOLD , 14));
		
		Dgb = new JButton("대 구"); 		
		Dgb.addActionListener(listener);
		frame.add(Dgb);
		Dgb.setBounds(400,495, 70, 30);
		Dgb.setFont(new Font(Font.SERIF, Font.BOLD , 14));

		Usb = new JButton("울 산"); 		
		Usb.addActionListener(listener);
		frame.add(Usb);
		Usb.setBounds(490,495, 70, 30);
		Usb.setFont(new Font(Font.SERIF, Font.BOLD , 14));
		
		Bsb = new JButton("부 산"); 	
		Bsb.addActionListener(listener);
		frame.add(Bsb);
		Bsb.setBounds(580,495, 70, 30);
  	    Bsb.setFont(new Font(Font.SERIF, Font.BOLD , 14));
  	 
  	    Jjb = new JButton("제 주"); 		
		Jjb.addActionListener(listener);
		frame.add(Jjb);
		Jjb.setBounds(670,495, 70, 30);
		Jjb.setFont(new Font(Font.SERIF, Font.BOLD , 14));

		al = new JLabel("확진 환자 : ");
		al.setBounds(80,535,80,25);
		frame.add(al);
	    al.setForeground(Color.RED);
	    al.setFont(new Font(Font.SERIF, Font.BOLD , 15));
	    
		a = new JTextField(" 33,824");
		frame.add(a);
		a.setForeground(Color.RED);
		a.setBounds(160,535,70,25);
		a.setFont(new Font(Font.SERIF, Font.BOLD , 15));
		
		bl = new JLabel("검사 중 : ");
		bl.setBounds(255,535,80,25);
		frame.add(bl);
		bl.setForeground(Color.GREEN);
		bl.setFont(new Font(Font.SERIF, Font.BOLD , 15));
		
		b = new JTextField(" 62,829");
		frame.add(b);
		b.setBounds(320,535,70,25);
		b.setForeground(Color.GREEN);
		b.setFont(new Font(Font.SERIF, Font.BOLD , 15));
		
		cl = new JLabel("격리 해제 : ");
		cl.setBounds(420,535,80,25);
		frame.add(cl); 
		cl.setForeground(Color.BLUE);
		cl.setFont(new Font(Font.SERIF, Font.BOLD , 15));
		
		c = new JTextField(" 27,542");
		frame.add(c);
		c.setBounds(500,535,70,25);
		c.setForeground(Color.BLUE);
		c.setFont(new Font(Font.SERIF, Font.BOLD , 15));
		
		dl = new JLabel("사망자 : ");
		dl.setBounds(590,535,80,25);
		frame.add(dl);
		dl.setForeground(Color.BLACK);
		dl.setFont(new Font(Font.SERIF, Font.BOLD , 15));
				
		d = new JTextField(" 523");
		frame.add(d);
		d.setBounds(650,535,70,25);
		d.setForeground(Color.BLACK);
		d.setFont(new Font(Font.SERIF, Font.BOLD , 15));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(300, 200);  //위치 지정
		frame.setVisible(true); //화면에 보이기
}
	private class ButtonListener implements ActionListener{ 
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == Bsb)  {
					new Busan();
				} if(e.getSource() == Dgb) {
					new Daegu();
				} if(e.getSource() == Djb) {
					new Daejeon();
				} if(e.getSource() == Gjb) {
					new Gwangju();
				} if(e.getSource() == Icb) {
					new Incheon();
				} if(e.getSource() == Jjb) {
					new Jeju();
				} if(e.getSource() == Sub) {
					new Seoul();
				} if(e.getSource() == Usb) {
					new Ulsan();
				}
								}		
							}
		public static void main(String[] args) {
			new Covid19Status();
		}
}

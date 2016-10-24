import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class mainfunc {
	
	static transient Scanner in = new Scanner (System.in);
	static ArrayList<casual> casual_list = new ArrayList<casual> ();
	static ArrayList<personal> personal_list = new ArrayList<personal> ();
	static ArrayList<professional> prof_list = new ArrayList<professional> ();
	static ArrayList<relative> relative_list = new ArrayList<relative> ();
	
	public static void main(String args[]) throws IOException, ClassNotFoundException{
		loadFromFile();
		int x = 1;
	do{
		System.out.println("1. Create and delete various types of acquaintances");
		System.out.println("2. Display the entire list of acquaintances");
		System.out.println("3. Display the list of specific category of acquaintances");
		System.out.println("4. Search a name from the acquaintance list");
		int x1,choice = 0;
		String s,str1;
		do{
			x1 = 2;
			try{
				s = in.nextLine();
				choice = Integer.parseInt(s);
			} catch (Exception e){
				System.out.println("Invalid Input, Enter again ");
				x1 = 1;
			}
		}while(x1 == 1);
		switch(choice)
		{
		     case 1 :
			            System.out.println("Select the type of aquaintance");
			            System.out.println("1. personal");
			            System.out.println("2. professional");
			            System.out.println("3. relative");
			            System.out.println("4. casual");
			            int ch = 0,c = 0;
			            do{
			    			x1 = 2;
			    			try{
			    				s = in.nextLine();
			    				ch = Integer.parseInt(s);
			    			} catch (Exception e){
			    				System.out.println("Invalid Input, Enter again ");
			    				x1 = 1;
			    			}
			    		}while(x1 == 1);
			            switch(ch)
			            {
			                 case 1:
			            	          System.out.println("Enter 1 for create, 2 for delete, and else for exit");
			            	          do{
			            	  			x1 = 2;
			            	  			try{
			            	  				s = in.nextLine();
			            	  				c = Integer.parseInt(s);
			            	  			} catch (Exception e){
			            	  				System.out.println("Invalid Input, Enter again ");
			            	  				x1 = 1;
			            	  			}
			            	  		 }while(x1 == 1);
			            	          if(c == 1)
			            	          {
			            	        	  personal temp = new personal ();
			            	        	  System.out.println("enter name :");
			            	        	  temp.setname(in.nextLine());
			            	        	  System.out.println("enter mobile no. :");
			            	        	  temp.setmobile(in.nextLine());
			            	        	  System.out.println("enter email id :");
			            	        	  temp.set_email(in.nextLine());
			            	        	  System.out.println("enter Context (upto 100 chars) :");
			            	        	  str1 = in.nextLine();
			            	        	  while(str1.length() > 100)
			            	        	  {
			            	        		  System.out.println("Limit exceeded, enter again (upto 100 chars)");
			            	        		  str1 = in.nextLine();
			            	        	  }
			            	        	  temp.setContext(str1);
			            	        	  System.out.println("enter date in which aquainted :");
			            	        	  temp.setAcqdate(in.nextLine());
			            	        	  System.out.println("enter specific events (upto 100 chars) :");
			            	        	  str1 = in.nextLine();
			            	        	  while(str1.length() > 100)
			            	        	  {
			            	        		  System.out.println("Limit exceeded, enter again (upto 100 chars)");
			            	        		  str1 = in.nextLine();
			            	        	  }
			            	        	  temp.setEvents(str1);
			            	        	  personal_list.add(temp);
			            	          }
			            	          else if (c != 2){
			            	        	  saveToFile();
			  							return;
			            	          }
			            	          else if(personal_list.size() == 0)
			                	         {
			                	        	 System.out.println("there is no personal friends");
			                	         }
			            	          else
			            	          {
			            	        	  int flag;
			            	        	 do
			            	        	 {
			            	        	  System.out.println("Enter name of the aquaintance to delete");
			            	        	  String str = in.nextLine();
			            	        	  flag=1;
			            	        	  for(int i=0; i<personal_list.size(); i++)
			            	        	  {
			            	        		  if(str.compareTo(personal_list.get(i).getname()) == 0)  
			            	        		  {
			            	        			  personal_list.remove(i);
			            	        			  flag = 2;
			            	        			  break;
			            	        		  }
			            	        	  }
			            	        	  if(flag == 1)
			            	        	  {
			            	        		  System.out.println("Sorry this name doesn't exists");
			            	        	  }
			            	        	 }while(flag == 1);
			            	          }
			            	          break;
			                 case 2 :
			                	         System.out.println("Enter 1 for create, 2 for delete, and else for exit");
			                	         do{
					            	  			x1 = 2;
					            	  			try{
					            	  				s = in.nextLine();
					            	  				c = Integer.parseInt(s);
					            	  			} catch (Exception e){
					            	  				System.out.println("Invalid Input, Enter again ");
					            	  				x1 = 1;
					            	  			}
					            	  		 }while(x1 == 1);
			                	         if(c == 1)
			                	         {
			                	        	 professional temp = new professional();
			                	        	 System.out.println("enter name :");
			                	        	 temp.setname(in.nextLine());
			                	        	 System.out.println("enter mobile no. :");
			                	        	 temp.setmobile(in.nextLine());
			                	        	 System.out.println("enter email id :");
			                	        	 temp.set_email(in.nextLine());
			                	        	 System.out.println("enter interest :");
			                	        	 temp.setInterest(in.nextLine());
			                	        	 prof_list.add(temp);
			                	         }
				            	          else if (c != 2){
				            	        	  saveToFile();
				  							return;
				            	          }
			                	         else if(prof_list.size() == 0)
			                	         {
			                	        	 System.out.println("there is no professional friends");
			                	         }
			                	         else
			                	         {
			                	        	 int flag;
				            	        	 do
				            	        	 {
				            	        	  System.out.println("Enter name of the aquaintance to delete");
				            	        	  String str = in.nextLine();
				            	        	  flag=1;
				            	        	  for(int i=0; i<prof_list.size(); i++)
				            	        	  {
				            	        		  if(str.compareTo(prof_list.get(i).getname()) == 0)  
				            	        		  {
				            	        			  prof_list.remove(i);
				            	        			  flag = 2;
				            	        			  break;
				            	        		  }
				            	        	  }
				            	        	  if(flag == 1)
				            	        	  {
				            	        		  System.out.println("Sorry this name doesn't exists");
				            	        	  }
				            	        	 }while(flag == 1); 
			                	         }
			                	         break;
			                 case 3 :
			                	         System.out.println("Enter 1 for create, 2 for delete, and else for exit");
			                	         do{
					            	  			x1 = 2;
					            	  			try{
					            	  				s = in.nextLine();
					            	  				c = Integer.parseInt(s);
					            	  			} catch (Exception e){
					            	  				System.out.println("Invalid Input, Enter again ");
					            	  				x1 = 1;
					            	  			}
					            	  		 }while(x1 == 1);
			                	         if(c == 1)
			                	         {
			                	        	 relative temp = new relative();
			                	        	 System.out.println("enter name :");
			                	        	 temp.setname(in.nextLine());
			                	        	 System.out.println("enter mobile no. :");
			                	        	 temp.setmobile(in.nextLine());
			                	        	 System.out.println("enter email id :");
			                	        	 temp.set_email(in.nextLine());
			                	        	 System.out.println("enter birth day :");
			                	        	 temp.setBday(in.nextLine());
			                	        	 System.out.println("enter date of last meating :");
			                	        	 temp.setDolm(in.nextLine());
			                	        	 relative_list.add(temp);
			                	         }
				            	          else if (c != 2){
				            	        	  saveToFile();
				  							return;
				            	          }
			                	         else if(relative_list.size() == 0)
			                	         {
			                	        	 System.out.println("there is no relatives");
			                	         }
			                	         else
			                	         {
			                	        	 int flag;
				            	        	 do
				            	        	 {
				            	        	  System.out.println("Enter name of the aquaintance to delete");
				            	        	  String str = in.nextLine();
				            	        	  flag=1;
				            	        	  for(int i=0; i<relative_list.size(); i++)
				            	        	  {
				            	        		  if(str.compareTo(relative_list.get(i).getname()) == 0)  
				            	        		  {
				            	        			  relative_list.remove(i);
				            	        			  flag = 2;
				            	        			  break;
				            	        		  }
				            	        	  }
				            	        	  if(flag == 1)
				            	        	  {
				            	        		  System.out.println("Sorry this name doesn't exists");
				            	        	  }
				            	        	 }while(flag == 1); 
			                	         }
			                	         break;
			                	         
			                 case 4 :
		                	 			 System.out.println("Enter 1 for create, 2 for delete, and else for exit");
		                	 			do{
				            	  			x1 = 2;
				            	  			try{
				            	  				s = in.nextLine();
				            	  				c = Integer.parseInt(s);
				            	  			} catch (Exception e){
				            	  				System.out.println("Invalid Input, Enter again ");
				            	  				x1 = 1;
				            	  			}
				            	  		 }while(x1 == 1);
			                	         if(c == 1)
			                	         {
			                	        	 casual temp = new casual();
			                	        	 System.out.println("enter name :");
			                	        	 temp.setname(in.nextLine());
			                	        	 System.out.println("enter mobile no. :");
			                	        	 temp.setmobile(in.nextLine());
			                	        	 System.out.println("enter email id :");
			                	        	 temp.set_email(in.nextLine());
			                	        	 System.out.println("enter date when you met :");
			                	        	 temp.setCdate(in.nextLine());
			                	        	 System.out.println("enter where do you met :");
			                	        	 temp.setWhere(in.nextLine());
			                	        	 System.out.println("in what circumstances do you met :");
			                	        	 temp.setCircum(in.nextLine());
			                	        	 System.out.println("enter any other useful information :");
			                	        	 temp.setInfo(in.nextLine());
			                	        	 casual_list.add(temp);
			                	         }
				            	          else if (c != 2){
				            	        	  saveToFile();
				  							return;
				            	          }
			                	         else if(casual_list.size() == 0)
			                	         {
			                	        	 System.out.println("there is no casual friends");
			                	         }
			                	         else
			                	         {
			                	        	 int flag;
				            	        	 do
				            	        	 {
				            	        	  System.out.println("Enter name of the aquaintance to delete");
				            	        	  String str = in.nextLine();
				            	        	  flag=1;
				            	        	  for(int i=0; i<casual_list.size(); i++)
				            	        	  {
				            	        		  if(str.compareTo(casual_list.get(i).getname()) == 0)  
				            	        		  {
				            	        			  casual_list.remove(i);
				            	        			  flag = 2;
				            	        			  break;
				            	        		  }
				            	        	  }
				            	        	  if(flag == 1)
				            	        	  {
				            	        		  System.out.println("Sorry this name doesn't exists");
				            	        	  }
				            	        	 }while(flag == 1); 
			                	         }
			                	         break;
			                	 
			            }
			            break;
			            
		case 2 :
					showpersonal();
			        System.out.println();
			        showprofessional();
			        System.out.println();
			        showrelative();
			        System.out.println();
			        showcasual();
			        break;
			
		case 3 :
					int flag = 2;
				do{
					flag = 2;
					System.out.println("1. personal");
					System.out.println("2. professional");
					System.out.println("3. relative");
					System.out.println("4. casual");
					String str;
					int c1 = 0;
					do{
        	  			x1 = 2;
        	  			try{
        	  				str = in.nextLine();
        	  				c1 = Integer.parseInt(str);
        	  			} catch (Exception e){
        	  				System.out.println("Invalid Input, Enter again ");
        	  				x1 = 1;
        	  			}
        	  		 }while(x1 == 1);
					if(c1 == 1){
						showpersonal();
					}
					else if (c1 == 2){
						showprofessional();
					}
					else if (c1 == 3){
						showrelative();
					}
					else if (c1 == 4){
						showcasual();
					}
					else{
						System.out.println("invalid input !!!");
						System.out.println("do you want to exit");
						str = in.nextLine();
						str = str.toLowerCase();
						if (str.compareTo("yes") == 0 ){
							saveToFile();
							return;
						}
						System.out.println("Enter again :");
						flag = 1;
					}
					if (flag != 1){
						System.out.println("\nEnter 1 to show another list, else for exit");
						str = in.nextLine();
						c1 = Integer.parseInt(str);
						if ( c1 == 1 ){
							flag = 1;
						}
						else {
							saveToFile();
							return;
						}
					}
				}while(flag == 1);
					break;
		case 4 :
					int f = 1;
					do {
						f = 1;
					System.out.println("Enter name of the aquaintance");
					String name = in.nextLine();
					name = name.toLowerCase();
					String comp;
					int fl = 0;
					for(int k=0; k<personal_list.size(); k++){
						comp = personal_list.get(k).getname();
						comp = comp.toLowerCase();
						if ( comp.compareTo(name) == 0){
							System.out.println("name found");
							fl = 1;
							System.out.printf("\nname - %s",personal_list.get(k).getname());
							System.out.printf("\nmobile no. - %s",personal_list.get(k).getmobile());
							System.out.printf("\nemail id - %s",personal_list.get(k).get_email());
							System.out.printf("\ncontext - %s",personal_list.get(k).getContext());
							System.out.printf("\ndate on which aquainted - %s",personal_list.get(k).getAcqdate());
							System.out.printf("\nspecific events - %s\n",personal_list.get(k).getEvents());
						}
					}
					if (fl == 0)
					{
						for(int i=0; i<prof_list.size(); i++)
						{
							comp = prof_list.get(i).getname();
							comp = comp.toLowerCase();
							if ( comp.compareTo(name) == 0)
							{
								System.out.println("name found");
								fl = 1;
				        		System.out.printf("\nname - %s",prof_list.get(i).getname());
				        		System.out.printf("\nmobile no. - %s",prof_list.get(i).getmobile());
				        		System.out.printf("\nemail id - %s",prof_list.get(i).get_email());
				        		System.out.printf("\nspecific common professional interests - %s\n",prof_list.get(i).getInterest());
							}
						}
					}
					if (fl == 0)
					{
						for(int i=0; i<relative_list.size(); i++)
						{
							comp = relative_list.get(i).getname();
							comp = comp.toLowerCase();
							if ( comp.compareTo(name) == 0)
							{
								System.out.println("name found");
								fl = 1;
								System.out.printf("\nname - %s",relative_list.get(i).getname());
				        		System.out.printf("\nmobile no. - %s",relative_list.get(i).getmobile());
				        		System.out.printf("\nemail id - %s",relative_list.get(i).get_email());
				        		System.out.printf("\ndate of birth - %s",relative_list.get(i).getBday());
				        		System.out.printf("\ndate of last meeting - %s\n",relative_list.get(i).getDolm());
							}
						}
					}
					if (fl == 0)
					{
						for(int i=0; i<casual_list.size(); i++)
						{
							comp = casual_list.get(i).getname();
							comp = comp.toLowerCase();
							if ( comp.compareTo(name) == 0)
							{
								System.out.println("name found");
								fl = 1;
								System.out.printf("\nname - %s",casual_list.get(i).getname());
				        		System.out.printf("\nmobile no. - %s",casual_list.get(i).getmobile());
				        		System.out.printf("\nemail id - %s",casual_list.get(i).get_email());
				        		System.out.printf("\nwhen you met - %s",casual_list.get(i).getCdate());
				        		System.out.printf("\nwhere you met - %s",casual_list.get(i).getWhere());
				        		System.out.printf("\nIn which circumstances you met - %s",casual_list.get(i).getCircum());
				        		System.out.printf("\nother useful informations - %s\n",casual_list.get(i).getInfo());
							}
						}
					}
					if (fl == 0)
					{
						System.out.println("name not found ...");
						System.out.println("enter 1 for search again, else for exit");
						String s1 = in.nextLine();
						int f1 = Integer.parseInt(s1);
						if (f1 == 1){
							f = 1;
						}
						else{
							saveToFile();
							return;
						}
					}
					else
					{
						System.out.println("enter 1 for search another, else for exit");
						String s1 = in.nextLine();
						int f1 = Integer.parseInt(s1);
						if (f1 == 1){
							f = 1;
						}
						else{
							saveToFile();
							return;
						}
					}
					}while(f == 1);
					break;
			
		}//end of switch
		System.out.println("\nEnter yes to exit, else for not");
		  String fl = in.nextLine();
		  fl = fl.toLowerCase();
		  if(fl.compareTo("yes") == 0)
			  x = 2;
		  
	 }while(x == 1);
	saveToFile();
	
   }//end of main()
	
	public static void loadFromFile() throws IOException, ClassNotFoundException {
        int personalcount = 0;
		ObjectInputStream is;
		try{
			is = new ObjectInputStream(new FileInputStream("src/personal.txt"));
		}catch(FileNotFoundException e){
			personalcount = 0; return;
		}
		personalcount = is.readInt();
		for(int i=0; i<personalcount; i++){
			personal_list.add((personal) is.readObject());
			
		}
		is.close();
		
		int profcount = 0;
		ObjectInputStream is1;
		try{
			is1 = new ObjectInputStream(new FileInputStream("src/professional.txt"));
		}catch(FileNotFoundException e){
			profcount = 0; return;
		}
		profcount = is1.readInt();
		for(int i=0; i<profcount; i++){
			prof_list.add((professional) is1.readObject());
			
		}
		is1.close();
		
		int relcount = 0;
		ObjectInputStream is2;
		try{
			is2 = new ObjectInputStream(new FileInputStream("src/relative.txt"));
		}catch(FileNotFoundException e){
			relcount = 0; return;
		}
		relcount = is2.readInt();
		for(int i=0; i<relcount; i++){
			relative_list.add((relative) is2.readObject());
			
		}
		is2.close();
		
		int casualcount = 0;
		ObjectInputStream is3;
		try{
			is3 = new ObjectInputStream(new FileInputStream("src/casual.txt"));
		}catch(FileNotFoundException e){
			casualcount = 0; return;
		}
		casualcount = is3.readInt();
		for(int i=0; i<casualcount; i++){
			casual_list.add((casual) is3.readObject());
			
		}
		is3.close();
	}
	
	public static void saveToFile() throws FileNotFoundException, IOException {
        int personalcount = personal_list.size();
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("src/personal.txt"));
		os.writeInt(personalcount);
		for(int i=0; i<personalcount; i++){
			os.writeObject(personal_list.get(i));
		}
		os.close();
		
		int profcount = prof_list.size();
		ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream("src/professional.txt"));
		os1.writeInt(profcount);
		for(int i=0; i<profcount; i++){
			os1.writeObject(prof_list.get(i));
		}
		os1.close();
		
		int relativecount = relative_list.size();
		ObjectOutputStream os2 = new ObjectOutputStream(new FileOutputStream("src/relative.txt"));
		os2.writeInt(relativecount);
		for(int i=0; i<relativecount; i++){
			os2.writeObject(relative_list.get(i));
		}
		os2.close();
		
		int casualcount = casual_list.size();
		ObjectOutputStream os3 = new ObjectOutputStream(new FileOutputStream("src/casual.txt"));
		os3.writeInt(casualcount);
		for(int i=0; i<casualcount; i++){
			os3.writeObject(casual_list.get(i));
		}
		os3.close();
	}
	public static void showpersonal()
	{
		if(personal_list.size() == 0)
		{
			System.out.println("there is no personal friend");
		}
		else
		{
			for(int i=0; i<personal_list.size(); i++)
			{
				System.out.printf("\nPersonal friend - %d",i+1);
				System.out.printf("\nname - %s",personal_list.get(i).getname());
				System.out.printf("\nmobile no. - %s",personal_list.get(i).getmobile());
				System.out.printf("\nemail id - %s",personal_list.get(i).get_email());
				System.out.printf("\ncontext - %s",personal_list.get(i).getContext());
				System.out.printf("\ndate on which aquainted - %s",personal_list.get(i).getAcqdate());
				System.out.printf("\nspecific events - %s\n",personal_list.get(i).getEvents());
			}
		}
	}
	public static void showprofessional()
	{
		if(prof_list.size() == 0)
        {
        	System.out.println("there is no professional friend");
        }
        else
        {
        	for(int i=0; i<prof_list.size(); i++)
        	{
        		System.out.printf("\nprofessional friend - %d",i+1);
        		System.out.printf("\nname - %s",prof_list.get(i).getname());
        		System.out.printf("\nmobile no. - %s",prof_list.get(i).getmobile());
        		System.out.printf("\nemail id - %s",prof_list.get(i).get_email());
        		System.out.printf("\nspecific common professional interests - %s\n",prof_list.get(i).getInterest());
        	}
        }
	}
	public static void showrelative()
	{
		if(relative_list.size() == 0)
        {
        	System.out.println("there is no relative");
        }
        else
        {
        	for(int i=0; i<relative_list.size(); i++)
        	{
        		System.out.printf("\nrelative - %d",i+1);
        		System.out.printf("\nname - %s",relative_list.get(i).getname());
        		System.out.printf("\nmobile no. - %s",relative_list.get(i).getmobile());
        		System.out.printf("\nemail id - %s",relative_list.get(i).get_email());
        		System.out.printf("\ndate of birth - %s",relative_list.get(i).getBday());
        		System.out.printf("\ndate of last meeting - %s\n",relative_list.get(i).getDolm());
        	}
        }
	}
	public static void showcasual()
	{
		if(casual_list.size() == 0)
        {
        	System.out.println("there is no casual friend");
        }
        else
        {
        	for(int i=0; i<casual_list.size(); i++)
        	{
        		System.out.printf("\ncasual - %d",i+1);
        		System.out.printf("\nname - %s",casual_list.get(i).getname());
        		System.out.printf("\nmobile no. - %s",casual_list.get(i).getmobile());
        		System.out.printf("\nemail id - %s",casual_list.get(i).get_email());
        		System.out.printf("\nwhen you met - %s",casual_list.get(i).getCdate());
        		System.out.printf("\nwhere you met - %s",casual_list.get(i).getWhere());
        		System.out.printf("\nIn which circumstances you met - %s",casual_list.get(i).getCircum());
        		System.out.printf("\nother useful informations - %s\n",casual_list.get(i).getInfo());
        	}
        }
	}

}

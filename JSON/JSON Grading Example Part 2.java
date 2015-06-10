//Program will promps the user to enter name and course/grade
//this will be stored in appropriate JSON structure (can do "on the fly" in otherwords, dont have to create a temporary //ArraryList).  This will be saved to a text file, which when the user hits return, the file will be read, and it will be //loaded into a JSON structure and print the info.  

package jsonexercise;

import java.util.Scanner

//creating JSON data structures to save them to a file
public class JSONExcorsice
{
	public static void main(string[])
       Scanner input = new Scaner(System.in);

       //creating student name and then creating root object, then putting name value pair in the object. 
       //Next we create JSON array and then we have container, then we loop and askw user for course name 
       //and grade and cretaing a JSON object with that and putting grade and name value pairs into the object, 
       //body of loop we are adding JSON obejct to the JSON arrray sso we are going to keep adding as long as 
       //user does not put enter. once we are done we can add that course array to the root object.  In that we are giving
       //it the nameof of courses and the value is the array //now we are going to write this all to a file


       System.out.print("Enter student name: ");
       String name = input.nextLine();

       //create new jason object
       JSONObject root = new JSONObject();

       //before adding loop, already putting name value pair in object
       root.put("name", name);

       //going to modify so we can create an array of courses, ad get grade in loop
       //infinate loop with break statement like if they enter blank

       //create JASON array, going to have one course that we created query for storing the class object, adding before the loop
       //its in the loop that we are adding object to the array
       JASONArray courses = new JASONArray();


       

       //loop is going to query user for the name, grade, and going to create a new JSON object for every course that the student enters and its going
       //to be adding the objects to the ARRAY
       while(true)
       {
          //get the course name
          System.out.print("Enter course name: ");
          String course = input.nextLine();//if course is null or empty we want to leave loop

          //check to see if user hit Enter
          if (course.length() == 0)
          {
              break;
          }

          //get the course grade
          System.out.print("enter Grade: ");
          int grade = input.nextInt();

          if(input.hasNextLine())
          {
              input.nextLine();
          }
          
          //create a JASON object
          JSONObject courseObject = new JSONObject();
          //name and grade that was input from user
          courseObject.put("grade", grade);
          courseObject.put("name", course);

          //add the course to the array
          //going to 
          courses.add(courseObject);
          
       }
       //once user is don adding courses we are going to add the array to the root JSON object.  


       //add the array to the root object
       root.put("courses", courses);

       System.out.println(root.toJASONString());
       //go to JASONLint.com and see if the JSASON is properly formatted. 



       //now we are creating the actual file with teh JSON strcture to it
       File file = new File("StudentGrades.txt");


       try (PrintWriter writer = new PrintWriter(file))
       {
              writer.print(root.toJASONString());
       }
       catch (FileNotFoundException ex)
       {
              SYstem.out.println(ex.toString());
       }


       //next thing to do will be to read the file
       //read file after user hits enter
       SYstem.out.println("File created successfully\n\n Hit Reutrn to display");
       input.nextLine();

       //creating another scanner
       //scanner will be user for reading from a file no longer in the console
       try
       {
          //using same file
          input = new Scanner(file);
          //continue reading whole file line by line until rewad the entire thing. 
          StringBuilder jsonIn = new StringBuilder;
          while (input.hasNextLine())
          {
              jsonIn.append(input.nextLine);
              //just goig to read is and append to string builfer
          }
          //going to print on console for sanitation check, should see same string 
          System.out.println(jsonIn.toString());
          //want to recreate the json structure givent he JSON string, to do this must use JSON parse.  user parser to parse the file
          JSONParser = new JSONParser();

          //root element in json can be either an array or an object
          //cast to array or object
          //use string we just read in from file
          JSONObject objRoot = (JSONOBJECT) parser.parse(jsonIn.toString());

          //will add catch clause for parse exception


          //this is going to reurn an object so we are going to have to cast to string
          System.out.print("Student name is %s\n", objectRoot.get("name").toString);

          //cycle throug array of courses and list them on a line.  

          //going to create variable, so value will now be array,
          //we need to cast
          JSONArray coursesIn = objRoot.get("courses");

          //loop through the array and display values on console
          for (int i = 0; 1 < coursesIn.size(); i++)
          {
              //temp object
              JSONObject courseIn = (JSONObject) coursesIn.get(i);
              //returns long which cannot cast into integer, so make it a long
              long gradeIn = (long) courseIn.get("grade");
              String nameIn = (String) courseIn.get("name");

              System.out.println("Course %s; grade %d", nameIn, gradeIn);
          }
       }
       catch (flieNotFoundException ex)
       {
             System.out.println(ex.toString());
       }
       catch (ParseException ex)
       {
             System.out.println(ex.toString()); 
       }


       

}
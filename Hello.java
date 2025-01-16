public class Hello{
    public static void main(String[] args) {

        // Student s1 = new Student();
        // s1.rollno = 1;
        // s1.name = "Ram";
        // s1.marks = 88;

        // Student s2 = new Student();
        // s2.rollno = 2;
        // s2.name = "Avi";
        // s2.marks = 67;

        // Student s3 = new Student();
        // s3.rollno = 3;
        // s3.name = "san";
        // s3.marks = 98;



        // Student students[] = new Student[3];

        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;

        // for(int i=0; i<students.length; i++){
        //     System.out.println(students[i].rollno + ". " + students[i].name + " : " + students[i].marks);
        // }


        /*int numbers[] = {1,2,3,4};

        for(int i : numbers){
            System.out.println(i);
        } */


        StringBuffer sb = new StringBuffer("Avinash");
        //System.out.println(sb.length());
        sb.append(" Reddy");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);

        
        
        
        
    }
}



class Student{
    int rollno;
    String name;
    int marks;
}




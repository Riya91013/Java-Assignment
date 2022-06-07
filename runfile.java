abstract class BodyOfManagement{
    abstract void MsgOfManagement();
    abstract void ExpectedOfStudents();
}

class Administration extends BodyOfManagement{
    void MsgOfManagement()
    {
        System.out.println("WE all welcome you students and hope u all will enjoy and learn a lot from this journey");
    }

    void ExpectedOfStudents()
    {
        System.out.println("You all are expected to behave properly in class and cmapus following the rules and curriculum.");
    }
}

class college{
    public String college_name;
    public String tier_of_clg;
    public String address_of_clg;
    public int age_of_clg;
    public int number_of_departments;

    public college(String collegeName , String tierOfClg , String addressOfClg, int ageOfClg)
    {
        this.college_name = collegeName;
        this.tier_of_clg = tierOfClg;
        this.address_of_clg = addressOfClg;
        this.age_of_clg = ageOfClg;
    }

    public void introducingTheClg()
    {
        System.out.println("The name of clg is: " + this.college_name);
        System.out.println("Teir of clg is: " + this.tier_of_clg);
        System.out.println("The address of clg is: " + this.address_of_clg);
        System.out.println("The clg is:  " + this.college_name  + " old.");
    }
}

class branch extends college{
    public String branch_name;

    public branch(String collegeName , String tierOfClg , String addressOfClg, int ageOfClg, String branchName)
    {
        super(collegeName,tierOfClg,addressOfClg,ageOfClg);
        this.branch_name = branchName;
    }

    public void display()
    {
        System.out.println("The branch is: " + branch_name);
    }
}

class student extends branch{
    public String name;
    public int roll_Num;
    public String gender;
    public int cpi;

    public student(String collegeName , String tierOfClg , String addressOfClg, int ageOfClg, String branchName, String Name, int rollNum, String Gender, int CPI)
    {
        super(collegeName,tierOfClg,addressOfClg,ageOfClg,branchName);
        this.name = Name;
        this.roll_Num = rollNum;
        this.gender = Gender;
        this.cpi = CPI;
    }
    
    public void Introduce_student()
    {
        System.out.println("The name of clg is: " + college_name);
        System.out.println("The Tier of clg is: " + tier_of_clg);
        System.out.println("The address of clg is: " + address_of_clg);
        System.out.println("The clg is: " + age_of_clg +" old.");
        System.out.println("The name of student is: " + this.name);
        System.out.println("The Roll Number of student is: " + this.roll_Num);
        System.out.println("The Gender of student is: " + this.gender);
        System.out.println("The CPI of student is: "+ this.cpi);
    }
}

class Eligible extends student{
    Eligible(String collegeName , String tierOfClg , String addressOfClg, int ageOfClg, String branchName, String Name, int rollNum, String Gender, int CPI)
    {
        super(collegeName,tierOfClg,addressOfClg,ageOfClg,branchName, Name, rollNum, Gender, CPI);
    }

    void IsEligible_For_Scholarship(int CPI)
    {
        if(CPI >= 9)
        {
            System.out.println("Yes, " + this.name + " You are eligible for regional scholarship");
        }
        else
        {
            System.out.println("No, " + this.name + " You are not eligible for regional scholarship");
        }
    }

    public void Introduce_Student()
    {
        System.out.println("The name of clg is: " + college_name);
        System.out.println("The Tier of clg is: " + tier_of_clg);
        System.out.println("The address of clg is: " + address_of_clg);
        System.out.println("The clg is: " + age_of_clg +" old.");
        System.out.println("The name of student is: " + this.name);
        System.out.println("The Roll Number of student is: " + this.roll_Num);
        System.out.println("The Gender of student is: " + this.gender);
        System.out.println("The CPI of student is: "+ this.cpi);
    }
}

abstract class StudentPast{
    abstract void Academic_History();
    abstract void School_records_for_violence();
}

class Record_of_Student extends StudentPast
{
    public void Academic_History()
    {
        System.out.println("Status of 10 th class is: Passed");
        System.out.println("Status of 12 th class is: Passed");
    }

    public void School_records_for_violence()
    {
        System.out.println("No violence record is found.");
    }
}

public class runfile{
    public static void main(String[] args) {

        Administration a1 = new Administration();
        a1.MsgOfManagement();
        a1.ExpectedOfStudents();

        Eligible s1 = new Eligible("IIT BHU", "Tier 1", "Varanasi", 102, "Mathematics and Computing", "Riya Singh", 21124044, "Female",9);

        s1.Introduce_Student();

        Record_of_Student r1 = new Record_of_Student();

        r1.Academic_History();
        r1.School_records_for_violence();
        s1.IsEligible_For_Scholarship(9);

        System.out.println();

        Administration a2 = new Administration();
        a2.MsgOfManagement();
        a2.ExpectedOfStudents();
        
        Eligible s2 = new Eligible("IIT BOMBAY", "Tier 1", "Bombay", 64, "Aerospace", "Gauri", 1325, "Female", 8);

        s2.Introduce_Student();

        Record_of_Student r2 = new Record_of_Student();

        r2.Academic_History();;
        r2.School_records_for_violence();
        s2.IsEligible_For_Scholarship(8);

        System.out.println();

        Administration a3 = new Administration();
        a3.MsgOfManagement();
        a3.ExpectedOfStudents();

        Eligible s3 = new Eligible("IIT BHU", "Tier-1", "Varanasi", 102, "Mathematics and Computing", "Sristi Jaiswal", 21124049, "Female", 9);

        s3.Introduce_Student();

        Record_of_Student r3 = new Record_of_Student();

        r3.Academic_History();
        r3.School_records_for_violence();
        s3.IsEligible_For_Scholarship(9);

        System.out.println();

        Administration a4 = new Administration();
        a4.MsgOfManagement();
        a4.ExpectedOfStudents();

        Eligible s4 = new Eligible("Galgotia", "Tier-2", "Gaziabad", 12, "IT", "Priyansh Rastogi", 274675, "Male", 9);

        s4.Introduce_Student();

        Record_of_Student r4 = new Record_of_Student();

        r4.Academic_History();
        r4.School_records_for_violence();
        s4.IsEligible_For_Scholarship(9);

        System.out.println();

        Administration a5 = new Administration();
        a5.MsgOfManagement();
        a5.ExpectedOfStudents();

       Eligible s5 = new Eligible("IIT BHU", "Tier-1", "Varanasi", 102, "Matematics and Computing", "Anshikha Gupta", 21124008, "Female", 8);

        s5.Introduce_Student();
        
        Record_of_Student r5 = new Record_of_Student();

        r5.Academic_History();
        r5.School_records_for_violence();
        s5.IsEligible_For_Scholarship(8);

        System.out.println();
    }
}

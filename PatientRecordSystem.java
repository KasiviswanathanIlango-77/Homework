
package builderdesign;


public class PatientRecordSystem 
{
    private String patientname;
    private int age;
    private String disease;
    private String doctorname;
    private String roomtype;
    private long billamount;
    //private Constructor
    private PatientRecordSystem(PrsBuilder builder )
    {
        this.patientname=builder.patientname;
        this.age=builder.age;
        this.disease=builder.disease;
        this.doctorname=builder.doctorname;
        this. roomtype=builder.roomtype;   
        this.billamount=builder.billamount;
    }
    public void showDetails()
    {
        System.out.println("PatientName:"+patientname);
        System.out.println("Age:"+age);
        System.out.println("Disease:"+disease);
        System.out.println("DoctorName:"+doctorname);
        System.out.println("RoomType:"+roomtype);
        System.out.println("Billamount:"+billamount);
    }
    //static Builder Class
    public static class PrsBuilder
    {
        private String patientname;
        private int age;
        private String disease;
        private String doctorname;
        private String roomtype;
        private long billamount;

        public PrsBuilder(String patientname, int age) {
            this.patientname = patientname;
            this.age = age;
        }
        

        public PrsBuilder setDisease(String disease) {
            this.disease = disease;
            return this;
        }

        public PrsBuilder setDoctorname(String doctorname) {
            this.doctorname = doctorname;
            return this;
        }

        public PrsBuilder setRoomtype(String roomtype) {
            this.roomtype = roomtype;
            return this;
        }

        public PrsBuilder setBillamount(long billamount) {
            this.billamount = billamount;
            return this;
        }
        public PatientRecordSystem build()
        {
            return new PatientRecordSystem(this);
        }
    }
}

public class Date {
    public static void main(String[] args) {
        Date date = new Date(3,7,2023);
        System.out.println( date );
        date.setDay(4);
        System.out.println("day:" + date.getDay());
        date.setMonth(5);
        System.out.println("month:" + date.getMonth());
        date.setYear(2024);
        System.out.println( "year:" + date.getYear());
        date.setDate(4,5,2024);
        System.out.println(date.toString());
    }
    int day,month,year;
    Date(int day,int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public int getDay() { // get có kiểu dữ liệu
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear(){
        return this.year;
    }
    public void setDay(int day){ //set khong có kiểu dữ liệu và ko sử dụng return
        this.day = day;
    }
    public void setMonth (int month){
        this.month = month;
    }
    public void setYear (int year){
        this.year = year;
    }
    public void setDate (int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString() {
        return "Date: " + getDay()+ "/" + getMonth() + "/" + getYear();
    }
}

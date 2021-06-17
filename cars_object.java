
public class cars_object {
String make;
String model;
int year;
public cars_object(String make,String model,int year){
    this.make=make;
    this.model=model;
    this.year=year;

}
    public String get_make(){
        return make;
    }
    public String get_model(){
        return model;
    }
    public int get_year(){
        return year;

    }

    public static void main(String[] args) {

    cars_object obj=new cars_object("make", "model", 2019);
    System.out.print(obj.get_year());

}    
}

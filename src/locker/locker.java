
package locker;

public class locker {
    private String[] day;
    private String[] Locker;
    private int countOfday = -1;
    private int countOfLocker= -1;
 
  
    
    public locker(int number){
  day = new String[number];
  Locker = new  String[number];
    }
    
    public boolean adddDay(String day){
    if(countOfday<this.day.length){
    countOfday++;
    this.day[countOfday] = day;
    return true;
    }else return false;
    }
    public boolean addLocker(String comment){
    if(countOfLocker<this.Locker.length){
        countOfLocker++;
        this.Locker[countOfLocker]= comment;
    return true;
    }else return false;
    }
   

    public String[] getDay() {
        return day;
    }

    public String[] getLocker() {
        return Locker;
    }
    
}
//dose

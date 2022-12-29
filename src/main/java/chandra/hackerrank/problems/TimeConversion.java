package chandra.hackerrank.problems;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(convertTime("07:05:45PM"));
        System.out.println(convertTime("12:01:00AM"));
    }
    static String convertTime(String s){
        String ss[] = s.split(":");
        Integer time = Integer.parseInt(ss[0]);
        if(s.endsWith("PM") && time >=1 && time<12){
             time = time+12;
            ss[0] = time.toString();

        }else if( s.endsWith("AM")&& time == 12){
            ss[0] = "00";
        }


        return ss[0]+":"+ss[1]+":"+ss[2].substring(0,2);
    }
}

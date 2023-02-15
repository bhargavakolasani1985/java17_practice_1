import java.util.List;

public class TestClass1 {

    public static void main(String[] args){

    }

    private int checkIntervals(List<List<Integer>> intList){
        int result = 0;
        for(int i=0; i<intList.size(); i++){
            for(int j=i+1; j<intList.size(); j++){
                if(intList.get(i).get(0) <= intList.get(j).get(0)  && intList.get(i).get(1) <= intList.get(j).get(0)){
                    result = 1;
                }
            }
        }
        return result;
    }

}

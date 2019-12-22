import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by countdyang on 12/21/2019.
 */
public class Combination {

    public List<String> letterCombination(int[] input){
        List<String> answer = new ArrayList<String>();
        String answerElement = "";
        //check valid input
        if(input == null || input.length == 0){
            answer.add(answerElement);
            return answer;
        }
        //construct the relationship according to the picture
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(0,"");
        map.put(1,"");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        //Format input to support input that more than 1 digit
        List<Integer> newInput = new ArrayList<Integer>();
        for(int i=0;i<input.length;i++){
            String temp = String.valueOf(input[i]);
            for(int j=0;j< temp.length();j++){
                if(temp.charAt(j)>'1'){
                    newInput.add(temp.charAt(j)-'0');
                }
            }
        }
        combination(newInput,map,answer,answerElement,0);
        return answer;
    }
    //Do combination and assemble the answer
    public void combination(List<Integer> digits,Map<Integer,String> map, List<String> res, String oneRes,int n) {
        if (n == digits.size()) {
            res.add(oneRes);
            return;
        }
        for (int j = 0; j < map.get(digits.get(n)).length(); j++) {
            oneRes = oneRes + map.get(digits.get(n)).charAt(j);
            combination(digits, map, res, oneRes, n + 1);
            oneRes = oneRes.substring(0, oneRes.length() - 1);
        }
    }


}





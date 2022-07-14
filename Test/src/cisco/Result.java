package cisco;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Result {
	public static void main(String[] args) {
		List<List<Integer>> matrix = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(7,8,9));
		find_largest_in_row_smallest_in_column_element_in_matrix(matrix);
	}

    /*
     * Complete the 'find_largest_in_row_smallest_in_column_element_in_matrix' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
     */

    public static int find_largest_in_row_smallest_in_column_element_in_matrix(List<List<Integer>> matrix) {

        System.out.println(matrix);
        if(matrix != null && matrix.size() ==1){
            return matrix.get(0).get(0);
        }
        int result = -1;
       int maxSoFar =0;
        for(List<Integer> row: matrix){       
            Integer max = Collections.max(row);
            int maxrowindex = row.indexOf(max);
            System.out.println(max);
            for(int i=0; i<row.size();i++ ){
                
                if(max<=row.get(maxrowindex)){
                        result = max;
                }
            }
        
        }
        
        return result;
    }

}

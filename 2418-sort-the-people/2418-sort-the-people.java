class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < heights.length; j++) {   // fixed bound
                if (heights[min] > heights[j]) {
                    min = j;
                }
            }
            int temp = heights[min];
            heights[min] = heights[i];
            heights[i] = temp;

            String str = names[min];
            names[min] = names[i];
            names[i] = str;
        }

        String[] result = new String[heights.length];
        for (int i = 0; i < heights.length; i++) {
            result[heights.length - 1 - i] = names[i];   // actual reversal
        }
        return result;
    }
}
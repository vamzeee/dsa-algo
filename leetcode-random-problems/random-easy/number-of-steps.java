import java.util.Map;
import java.util.HashMap;

class Solution {
    public int climbStairs(int n) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        return numberOfWays(0, n, map);
    }

    public int numberOfWays(int currentStep, int totalSteps, Map<Integer, Integer> map)
    {
        if (currentStep == totalSteps)
        {
            return 1;
        }
        else if (currentStep > totalSteps)
        {
            return 0;
        }
        else if (map.containsKey(currentStep))
        {
            return map.get(currentStep);
        }
        else
        {
            int currenStepWays = numberOfWays(currentStep+1, totalSteps, map) + numberOfWays(currentStep + 2, totalSteps, map);
            map.put(currentStep, currenStepWays);
            return currenStepWays;
        }
    }
}
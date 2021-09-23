package com.company;

public class CountingValleys {

    //8
    //UDDDUDUU
    public static int countingValleys(int steps, String path) {
        //A sequence of D outnumbering prior U indicated a descent into a valley
        //int seaLevelCounter = 0;
        //For each D, seaLevelCounter++
        //Else, seaLevelCounter--
        //For every time seaLevelCounter changes to -, valleyCounter++

        int valleyCounter = 0;
        int seaLevelCounter = 0;
        String[] pathArray = path.split("");

        for (int i = 0; i < steps; i++) {
            int currentLocation = seaLevelCounter;
            if (pathArray[i].equals("U")) {
                seaLevelCounter++;
            } else {
                seaLevelCounter--;
            }

            if (currentLocation < 0 && seaLevelCounter >= 0) {
                valleyCounter++;
            }
        }


        return valleyCounter;
    }
}

import java.util.Scanner;

    public class ex1 {
        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            int getNumDays;
            int temperatureValues[];
            int aboveAverage;

            System.out.print("How many days to save temperature for? --> ");
            getNumDays = read.nextInt();
            temperatureValues = new int[getNumDays];
            double averageTemp = 0;

            // get and save temperature values
            for (int countDays = 0; countDays < temperatureValues.length; countDays++) {
                System.out.print("Enter temperature for Day " + ++countDays + " --> ");
                temperatureValues[--countDays] = read.nextInt();
            }
            System.out.println();
            System.out.println("Entered:");

            // Prints saved and entered info
            for (int countDaysEntered = 0; countDaysEntered < temperatureValues.length; countDaysEntered++) {
                System.out.println("Temperature for Day " + ++countDaysEntered + " is: " + temperatureValues[--countDaysEntered]);
                averageTemp += temperatureValues[countDaysEntered];
            }
            averageTemp = Math.round(averageTemp /= temperatureValues.length);

            System.out.println();
            System.out.println("Average Temperature is: " + averageTemp);
            aboveAverage = aboveTempDays(averageTemp, temperatureValues);
            if(aboveAverage == 0) {
                System.out.println("No days are above average temperature!");
            }else{
                System.out.println(aboveAverage + " days are above average temperature!");
            }
        }

        // check for days above average temperature
        public static int aboveTempDays(double averageTemp, int temperatureValues[]){
            int numAboveDays = 0;

            for(int check = 0; check < temperatureValues.length; check++){
                if(temperatureValues[check] > averageTemp){
                    numAboveDays++;
                }
            }
            return numAboveDays;
        }
    }



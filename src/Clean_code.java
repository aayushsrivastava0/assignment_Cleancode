public class Clean_code
{
    /*Class to storing the greatest and smallest element in an array */

    static class GreatestSmallestElement
    {

        int smallNumber;
        int bigNumber;
    }

    /* Method for finding smallest and greatest array element and return the object*/

    static GreatestSmallestElement findGreatestSmallestElement(int givenNumberArray[], int arrayLength)
    {
        GreatestSmallestElement gse_object = new GreatestSmallestElement();
        int arrayIndex;

        if (arrayLength == 1)
        {
            gse_object.bigNumber = givenNumberArray[0];
            gse_object.smallNumber = givenNumberArray[0];
            return gse_object;
        }

        if (givenNumberArray[0] > givenNumberArray[1])
        {
            gse_object.bigNumber = givenNumberArray[0];
            gse_object.smallNumber = givenNumberArray[1];
        }
        else
        {
            gse_object.bigNumber = givenNumberArray[1];
            gse_object.smallNumber = givenNumberArray[0];
        }

        for (arrayIndex = 2; arrayIndex < arrayLength; arrayIndex++)
        {
            if (givenNumberArray[arrayIndex] > gse_object.bigNumber)
            {
                gse_object.bigNumber = givenNumberArray[arrayIndex];
            }
            else if (givenNumberArray[arrayIndex] < gse_object.smallNumber)
            {
                gse_object.smallNumber = givenNumberArray[arrayIndex];
            }
        }

        return gse_object;
    }

    public static void main(String args[])
    {
        int givenNumberArray[] = {6000, 11, 445, 3, 330, 9999};
        int arrayLength = 6;
        GreatestSmallestElement gse_object = findGreatestSmallestElement(givenNumberArray, arrayLength);
        System.out.printf("\nSmallest Number in the array is %d", gse_object.smallNumber);
        System.out.printf("\nGreatest Number in the array is is %d", gse_object.bigNumber);
    }
}


public class minMax {

    public static int max(int[] randomParty)
{
    int lenOfArray = randomParty.length;
    int i = 1;
    int maximum = randomParty[0];

    while (i < lenOfArray)
    {
        if (randomParty[i] > maximum)
        {
            maximum = randomParty[i];
        }
        i++;
    }
    return maximum;
}

public static int min(int[] randomParty)
{
    int lenOfArray = randomParty.length;
    int i = 1;
    int min = randomParty[0];

    while (i < lenOfArray)
    {
        if (randomParty[i] < min)
        {
            min = randomParty[i];
        }
        i++;
    }
    return min;
}
}

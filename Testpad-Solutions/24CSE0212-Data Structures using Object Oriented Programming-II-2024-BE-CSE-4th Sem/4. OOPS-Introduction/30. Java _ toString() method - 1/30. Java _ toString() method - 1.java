public String toString()
{
    if(balance < 0)
        return name + ", " + String.format("%.1f", balance) + " (NEGATIVE)";
    else
        return name + ", " + String.format("%.1f", balance);
}
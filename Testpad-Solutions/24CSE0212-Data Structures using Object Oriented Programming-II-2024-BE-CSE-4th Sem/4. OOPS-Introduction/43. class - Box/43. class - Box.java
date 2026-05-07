class Box
{
    private int length;
    private int breadth;
    private int height;
    // Default Constructor
    public Box()
    {
        length = 0;
        breadth = 0;
        height = 0;
    }
    // Parameterized Constructor
    public Box(int length, int breadth, int height)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    // Copy Constructor
    public Box(Box b1)
    {
        this.length = b1.length;
        this.breadth = b1.breadth;
        this.height = b1.height;
    }
    public int getLength()
    {
        return length;
    }
    public int getBreadth()
    {
        return breadth;
    }
    public int getHeight()
    {
        return height;
    }
    public long CalculateVolume()
    {
        return (long) length * breadth * height;
    }
}
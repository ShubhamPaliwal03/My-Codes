import java.util.Scanner;

class FLoodFillAMatrixQ733
{
    static void floodFillUtil(int[][] image, int sr, int sc, int prev_color, int color)
    {
        if(sr < 0 || sc<0 || sr >= image.length || sc >= image[0].length)
        {
            return;
        }

        if(image[sr][sc]!=prev_color)
        {
            return;
        }

        if(image[sr][sc]==color)
        {
            return;
        }

        image[sr][sc] = color;

        floodFillUtil(image, sr,   sc--, prev_color, color);
        floodFillUtil(image, sr--, sc,   prev_color, color);
        floodFillUtil(image, sr,   sc++, prev_color, color);
        floodFillUtil(image, sr++, sc,   prev_color, color);
    }

    static void floodFill(int[][] image, int sr, int sc, int color) 
    {
        int prev_color = image[sr][sc];

        if(prev_color==color)
        {
            return;
        }

        floodFillUtil(image, sr, sc, prev_color, color);

        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the no. of rows in the image : ");
        int rows = kb.nextInt();

        System.out.print("\n\nEnter the no. of columns in the image : ");
        int cols = kb.nextInt();

        int img[][] = new int[rows][cols];

        System.out.println("\n\nEnter values in the cells of an image of "+rows+" x "+cols+"\n");

        for(int i=0;i<img.length;i++)
        {
            for(int j=0;j<img[i].length;j++)
            {
                img[i][j] = kb.nextInt();
            }
        }

        int sr,sc,color;

        sr=sc=1;
        color=2;

        floodFill(img, sr, sc, color);

        System.out.println("The Image Obtained after performing Flood Fill on the given image is :\n");

        for(int row[]:img)
        {
            for(int val:row)
            {
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
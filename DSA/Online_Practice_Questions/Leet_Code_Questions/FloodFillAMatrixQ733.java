import java.util.Scanner;

class FloodFillAMatrixQ733
{
    static void floodFillUtil(int[][] image, int sr, int sc, int prev_color, int color)
    {
        // Is (sr, sc) out of bounds?
        // if yes, then return, as we cannot proceed further in that direction.

        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length)
        {
            return;
        }

        // Is the color of (sr, sc) different from the previous color?
        // if yes, then return, as we've encountered a boundary or already filled area

        if(image[sr][sc]!=prev_color)
        {
            return;
        }

        // Is the color of (sr, sc) already equal to the target color (color)?
        // if yes, then return, as there's no need to fill the same color again.

        if(image[sr][sc]==color)
        {
            return;
        }

        image[sr][sc] = color;


        floodFillUtil(image, sr,   sc-1, prev_color, color); // moving left
        floodFillUtil(image, sr-1, sc,   prev_color, color); // moving up
        floodFillUtil(image, sr,   sc+1, prev_color, color); // moving right
        floodFillUtil(image, sr+1, sc,   prev_color, color); // moving down
    }

    static void floodFill(int[][] image, int sr, int sc, int color) 
    {
        // we save the color of the starting position (sr, sc) as prev_color.

        int prev_color = image[sr][sc];

        // If the prev_color is the same as the target color to fill, then the starting position is already of the desired color,
        // and there's no need to perform the flood-fill, so we return immediately.

        if(prev_color==color)
        {
            return;
        }

        // If the prev_color is different from the color, the method calls the floodFillUtil method to perform the recursive flood-fill operation.

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

        sr=sc=0;
        color=2;

        floodFill(img, sr, sc, color);

        System.out.println("\n\nThe Image Obtained after performing Flood Fill on the given image is :\n");

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
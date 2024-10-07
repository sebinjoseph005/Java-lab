class FileExample

{

public static void main(String args[])

{

Try

{

new FileInputStream("filenamel.txt");

FileInputStream fin FileOutputStream fout new FileOutputStream("filename2.txt");

int i;

while((i-fin.read()) != -1)

{

fout.write(i);

}

System.out.println(" Successfully wrote to the specified file");

Fin.close();

fout.close(); }

catch(FileNotFoundException e)

System.out.println(e.getMessage());

catch(IOException e)

{ System.out. System.out.println(e.getMessage()); }
}
}
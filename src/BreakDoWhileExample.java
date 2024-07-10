public class BreakDoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        int j = 10;
        do {
                if (i == 5)
                {
                    i++;
                    break;
                }
   /*   System.out.println(i);
              if (j == 10)
            {
                i++;
                break;

            } */
            System.out.println(i);
            i++;
            System.out.println(j);
            j++;
        }while(i<=10);
    }
}
/*{@docRoot} - {@docRoot}  - to depict relative path to root directory of generated document from any page.
@author -	@author name text	To add the author of the class.
@code	{@code text} -  To show the text in code font without interpreting it as html markup or nested javadoc tag.
@version	- @version version-text	 To specify "Version" subheading and version-text when -version option is used.
@since	- @since release to add "Since" heading with since text to generated documentation.
@param	@param parameter - name description	To add a parameter with given name and description to 'Parameters' section.
        @return	@return - description	Required for every method that returns something (except void)*/
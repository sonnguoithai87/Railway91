import com.vti.entity.*;

/*
Mr.Son
 */
public class Main {
    public static void main(String[] args) {
//        IStudy ist1 = new Student();
//        ist1.diemDanh();
//

        News news1 = new News();
        news1.group = 1;

        news1.setGroup(1);

        news1.disPlay();
        //iNews.disPlay("SOn");
        Teacher teacher = new Teacher();

        IStudy ist2 = new Teacher();


        IStudy ist3 = new Student();
        news1.disPlay(ist2);
        news1.disPlay(ist3);


    }
}
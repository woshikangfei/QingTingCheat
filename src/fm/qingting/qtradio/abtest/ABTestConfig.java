package fm.qingting.qtradio.abtest;

public class ABTestConfig
{
  public static final String CoverageName = "ABTestCoverage";
  public static ABTestItem CustomCategory;
  public static ABTestItem Student;
  public static ABTestItem checkin;
  public static double coverage = 0.3D;
  public static ABTestItem frontCollection;
  public static ABTestItem[] items = arrayOfABTestItem;

  static
  {
    Student = new ABTestItem();
    CustomCategory = new ABTestItem();
    frontCollection = new ABTestItem();
    checkin = new ABTestItem();
    Student.OptionName = "StudentABTest";
    Student.OptionA = "1";
    Student.OptionB = "0";
    Student.number = 16;
    Student.generateMethod = ABTestItem.GenerateMethod.Manual;
    CustomCategory.OptionName = "CustomCategoryABTest";
    CustomCategory.OptionA = "1";
    CustomCategory.OptionB = "0";
    CustomCategory.number = 17;
    CustomCategory.generateMethod = ABTestItem.GenerateMethod.Auto;
    frontCollection.OptionName = "frontCollectionABTest";
    frontCollection.OptionA = "1";
    frontCollection.OptionB = "0";
    frontCollection.number = 18;
    frontCollection.generateMethod = ABTestItem.GenerateMethod.Auto;
    checkin.OptionName = "checkinABTest";
    checkin.OptionA = "1";
    checkin.OptionB = "0";
    checkin.number = 19;
    checkin.generateMethod = ABTestItem.GenerateMethod.Auto;
    ABTestItem[] arrayOfABTestItem = new ABTestItem[4];
    arrayOfABTestItem[0] = Student;
    arrayOfABTestItem[1] = CustomCategory;
    arrayOfABTestItem[2] = frontCollection;
    arrayOfABTestItem[3] = checkin;
  }
}

/* Location:           /Users/zhangxun-xy/Downloads/qingting2/classes_dex2jar.jar
 * Qualified Name:     fm.qingting.qtradio.abtest.ABTestConfig
 * JD-Core Version:    0.6.2
 */
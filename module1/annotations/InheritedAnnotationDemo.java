package annotations;

//Java Program to Illustrating Use of Custom Annotations
//With @inherited annotation
import java.lang.annotation.*;
import java.lang.reflect.AnnotatedElement;

//Creating our single valued custom annotation
//with @inherited annotation
@Inherited
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

@interface CustomAnnotation{
	String value() default "GFG";
}

@CustomAnnotation(value="Sky is limitless")
class Super{
	
}

public class InheritedAnnotationDemo extends Super{
   public static void main(String[] args) throws Exception {
	   System.out.println(new InheritedAnnotationDemo().getClass().getAnnotation(CustomAnnotation.class));
	   System.out.println(new Super().getClass().getAnnotation(CustomAnnotation.class));
	   
	   Class obj=Super.class;
	   printAnnotationState(obj);
   }
   
   static void printAnnotationState(AnnotatedElement ann) {
	   Annotation[] annotationsArray=ann.getAnnotations();
	   
	   for(Annotation a:annotationsArray) {
		   System.out.println("Name of the annotation: "+a.annotationType());
		   System.out.println("Value: "+((CustomAnnotation)a).value());
	   }
   }
}

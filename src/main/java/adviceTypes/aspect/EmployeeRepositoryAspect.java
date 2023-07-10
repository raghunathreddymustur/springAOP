package adviceTypes.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeRepositoryAspect {
    @Pointcut("within(adviceTypes.repo.*)")
    public void serviceOrSamePackageRepository()
    {}

    @Before("serviceOrSamePackageRepository()")
    public void before(JoinPoint joinPoint)
    {
        System.out.println("before - " + joinPoint.getSignature());
    }

    @After("serviceOrSamePackageRepository()")
    public void after(JoinPoint joinPoint)
    {
        System.out.println("after - " + joinPoint.getSignature());
    }

    @AfterThrowing(value = "serviceOrSamePackageRepository()", throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception)
    {
        System.out.println("after throwing exception - " + joinPoint.getSignature() + " - exception = " + exception);
    }

    @AfterReturning(value = "serviceOrSamePackageRepository()", returning = "returnValue")
    public void afterReturning(JoinPoint joinPoint, Object returnValue) {
        System.out.println("after returning " + joinPoint.getSignature() + " - returnValue = " + returnValue);
    }

    @Around("serviceOrSamePackageRepository()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around - before - " + joinPoint.getSignature());
        try {
            return joinPoint.proceed();
        } finally {
            System.out.println("around - after - " + joinPoint.getSignature());
        }
    }











}

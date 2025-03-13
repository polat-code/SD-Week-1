package myapp.custom_annotation_practice_2;

import org.springframework.stereotype.Service;

@Service
public class SampleService1 {

    @LogMethodParams
    public String processData(String data){
        return "proceedData : " + data;
    }
}

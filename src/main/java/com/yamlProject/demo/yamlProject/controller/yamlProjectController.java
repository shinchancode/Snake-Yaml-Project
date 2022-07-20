package com.yamlProject.demo.yamlProject.controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import com.yamlProject.demo.yamlProject.entity.Student;
import com.yamlProject.demo.yamlProject.service.yamlProjectService;

@RestController
public class yamlProjectController {
	@Autowired
	yamlProjectService studentservice;
	
	//Specify the file name and path here
	File file = new File("C:\\Users\\Aarti\\Downloads\\Snake-Yaml-Project-main\\Snake-Yaml-Project-main\\src\\main\\resources\\result.yml");

	
	@GetMapping("/student")
	public Map<String, Object> getStudent() throws FileNotFoundException
	{
		InputStream inputStream = new FileInputStream(file);
		Yaml yaml = new Yaml();
		Map<String, Object> data = yaml.load(inputStream);
		System.out.println(data);
		return data;

	}
	
	@PostMapping("/post")
	public String printUser(@RequestBody Student st) throws IOException {		
			Map<String, Map<String, Object>> map = new HashMap<>();
            Map<String, Object> map2 = new HashMap<>();
//            map2.put("studentId",st.getStudentId());
    		map2.put("name", (st.getName()).toString());
    		map2.put("age", st.getAge());
    		map2.put("address", (st.getAddress()).toString());
    		map2.put("gender", (st.getGender()).toString());
            
            map.put("Student " + (st.getStudentId()), map2);
        
        FileWriter writer = new FileWriter(file,true);
        
        DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        options.setPrettyFlow(false);

        Yaml yaml = new Yaml(options);
        String output = yaml.dump(map);
        System.out.println(output);
        yaml.dump(map, writer);
        studentservice.AddYaml(st);
        return output;
    }
}
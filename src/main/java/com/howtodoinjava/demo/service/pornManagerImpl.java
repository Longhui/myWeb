package com.howtodoinjava.demo.service;

import org.springframework.stereotype.Service;
import com.howtodoinjava.demo.model.pornPictureVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raolonghui on 16-1-31.
 */
@Service
public class pornManagerImpl implements pornManager {

   public List<pornPictureVO> getPictures(){
       List<pornPictureVO> pictures= new ArrayList<pornPictureVO>();
       pornPictureVO obj1 = new pornPictureVO();
       obj1.setUrl("urlurl");
       obj1.setSubjectName("subject");
       obj1.setAuthorName("author");
       obj1.setAuthorID(1);
       pictures.add(obj1);
       return pictures;
    }
}

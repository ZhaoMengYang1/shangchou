package com.k8101.controller.manager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.ProcessEngine;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


/**
 * 处理流程上传一级部署的控制器
 * @ClassName ProcessController
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author lfy
 * @Date 2017年7月17日 下午3:24:33
 * @version 1.0.0
 */
@Controller
@RequestMapping("/servicectrl/prod")
public class ProcessController {


}

package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Category;
import com.itheima.domain.Product;
import com.itheima.service.ICategoryService;
import com.itheima.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;
    @RequestMapping("/findAllCategory.do")
    @ResponseBody
    public List<Category> findAllCategory(){
        List<Category> categoryList = categoryService.findAllCategory();
        return categoryList;

    }
}

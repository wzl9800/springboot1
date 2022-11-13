package com.wzl.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.wzl.controller.utils.R;
import com.wzl.domain.Book;
import com.wzl.service.IBookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangzhilong
 * @dcreate 2022-02-15 9:51
 */
@RestController
@RequestMapping("/ibooks")
public class IBookController1 {

    @Resource
    private IBookService iBookService;

    @PostMapping
    public R sava(@RequestBody Book book){
        return new R(iBookService.save(book));
    }

    @DeleteMapping("{id}")
    public R removeById(@PathVariable Integer id){
        return new R(iBookService.removeById(id));
    }

    @PutMapping
    public R modify(@RequestBody Book book){
        return new R(iBookService.updateById(book));
    }

    @GetMapping("{id}")
    public R selectById(@PathVariable Integer id){
        return new R(true,iBookService.getById(id));
    }

    @GetMapping("/all")
    public R selectAll(){
        return new R(true,iBookService.list());
    }

    //分页

    @GetMapping("{currentPage}/{pageSize}")
    public R selectCondition(@PathVariable int currentPage,@PathVariable int pageSize){
        return new R(true,iBookService.queryPage(currentPage,pageSize));
    }

    //条件查询
    @PostMapping("{condition}")
    public R condition(@PathVariable String condition){
        return new R(true,iBookService.queryCondition(condition));
    }
}

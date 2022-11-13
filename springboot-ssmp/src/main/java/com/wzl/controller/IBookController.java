package com.wzl.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.wzl.domain.Book;
import com.wzl.service.IBookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangzhilong
 * @dcreate 2022-02-15 9:51
 */
//@RestController
@RequestMapping("/ibooks")
public class IBookController {

    @Resource
    private IBookService iBookService;

    @PostMapping
    public Boolean sava(@RequestBody Book book){
        return iBookService.save(book);
    }

    @DeleteMapping("{id}")
    public Boolean removeById(@PathVariable Integer id){
        return iBookService.removeById(id);
    }

    @PutMapping
    public Boolean modify(@RequestBody Book book){
        return iBookService.updateById(book);
    }

    @GetMapping("{id}")
    public Book selectById(@PathVariable Integer id){
        return iBookService.getById(id);
    }

    @GetMapping("/all")
    public List<Book> selectAll(){
        return iBookService.list();
    }

    //分页

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> selectCondition(@PathVariable int currentPage,@PathVariable int pageSize){
        return iBookService.queryPage(currentPage,pageSize);
    }

    //条件查询
    @GetMapping("{condition}")
    public List<Book> condition(@PathVariable String condition){
        return iBookService.queryCondition(condition);
    }
}

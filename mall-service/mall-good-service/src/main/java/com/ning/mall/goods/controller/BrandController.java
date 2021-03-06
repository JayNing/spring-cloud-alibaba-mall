package com.ning.mall.goods.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ning.mall.goods.model.Brand;
import com.ning.mall.goods.service.BrandService;
import com.ning.mall.util.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName: BrandController
 * Description:
 * date: 2021/3/30 13:20
 *
 * @author ningjianjian
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    /****
     * 条件分页查询
     */
    @PostMapping(value = "/pageList")
    public RespResult<Page<Brand>> pageList(@RequestBody(required = false) Brand brand,
                                            @RequestParam(value = "pageNum") Long pageNum,
                                            @RequestParam(value = "pageSize") Long pageSize){
        // 查询
        return RespResult.ok(brandService.queryPageList(brand,pageNum, pageSize));
    }
    /****
     * 条件查询
     */
    @PostMapping(value = "/list")
    public RespResult<List<Brand>> list(@RequestBody(required = false) Brand brand){
    // 查询
        List<Brand> brands = brandService.queryList(brand);
        return RespResult.ok(brands);
    }

    /***
     * 增加品牌
     */
    @PostMapping
    public RespResult add(@RequestBody Brand brand){
        // 增加品牌
        brandService.save(brand);
        return RespResult.ok();
    }
    /**
     * 修改
    */
    @PutMapping
    public RespResult update(@RequestBody Brand brand){
        //修改品牌
        brandService.updateById(brand);
        return RespResult.ok();
    }

    /**
        ****
        * 删除品牌
    */
    @DeleteMapping("/{id}")
    public RespResult delete(@PathVariable(value = "id") Integer id){
        //删除品牌
        brandService.removeById(id);
        return RespResult.ok();
    }
}

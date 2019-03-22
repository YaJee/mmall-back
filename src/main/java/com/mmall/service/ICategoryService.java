package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

/**
 * Created by yajie on 2019/3/22.
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
    ServerResponse updateCategoryName(Integer categoryId,String categoryName);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);

}

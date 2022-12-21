package com.itheima.mcdonald.dto;

import com.itheima.mcdonald.entity.Setmeal;
import com.itheima.mcdonald.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}

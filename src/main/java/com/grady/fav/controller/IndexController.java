/*
 * Copyright (C) 2018  Grady
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.grady.fav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.grady.fav.web.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


/**
 * 项目入口控制器
 * Created by Grady on 2018/08/10
 */
@Controller
@RequestMapping("/")
public class IndexController extends BaseController {

    /**
     * index页面
     */
    @GetMapping("/index")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }
}


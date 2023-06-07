//package ru.pryakhina.springcourse.controllers;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import ru.pryakhina.springcourse.dao.PersonDAO_old;
//import ru.pryakhina.springcourse.models.Person;
//import ru.pryakhina.springcourse.util.PersonValidator;
//
//@Controller
//@RequestMapping("/people")
//
//public class PeopleController_old {
//
//    private final PersonDAO_old personDAO;
//    private final PersonValidator personValidator;
//
//    @Autowired
//    public PeopleController_old(PersonDAO_old personDAO, PersonValidator personValidator) {
//        this.personDAO = personDAO;
//        this.personValidator = personValidator;
//    }
//
//    @GetMapping
//    public String index(Model model)
//    {
////        model.addAttribute("people", personDAO.index());
//        return "/people/index";
//    }
//
//    @GetMapping("/{id}")
//    public String show(@PathVariable("id") int id,
//                       Model model)
//    {
//        model.addAttribute("id", personDAO.show(id));
//        return "/people/show";
//    }
//
//    @GetMapping("/new")
//    public String newPerson(@ModelAttribute("person") Person person)
//    {
//        return "/people/new";
//    }
//
////    @PostMapping()
////    public String create(@Valid @ModelAttribute("person") Person person,
////                         BindingResult bindingResult) {
////        personValidator.validate(person, bindingResult);
////
////        if (bindingResult.hasErrors())
////            return "/people/new";
////        personDAO.save(person);
////        return "redirect:/people";
////    }
//
//    @GetMapping("/{id}/edit")
//    public String edit(Model model, @PathVariable("id") int id)
//    {
//        model.addAttribute("person", personDAO.show(id));
//        return "/people/edit";
//    }
//
////    @PatchMapping("/{id}")
////    public String update(@ModelAttribute("person") @Valid Person person,
////                         BindingResult bindingResult,
////                         @PathVariable("id") int id){
////        personValidator.validate(person, bindingResult);
////        if (bindingResult.hasErrors())
////            return "/people/edit";
////        personDAO.update(id, person);
////        return "redirect:/people";
////    }
//
//    @DeleteMapping("/{id}")
//    public String delete(@PathVariable("id") int id){
//        personDAO.delete(id);
//        return "redirect:/people";
//    }
//}
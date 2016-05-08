package com.planrest;

import com.planrest.dao.impl.*;
import com.planrest.models.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Profile yarik = new Profile("1348", "yarik@gmail.com", "man", "Yarik", "Taleb");
//        Profile ivan = new Profile("1234", "ivango@gmail.com", "man", "Ivan", "Pavlychenko");
//        Profile dima = new Profile("1134", "dimas@gmail.com", "man", "Dima", "Zakharchuk");
//        Profile leha = new Profile("1004", "leha@gmail.com", "man", "Leha", "Smolar");
//
//        ProfileDao profileDao = new ProfileDao();
//        profileDao.add(yarik);
//        profileDao.add(ivan);
//        profileDao.add(dima);
//        profileDao.add(leha);

//        ProfileDao userDao = new ProfileDao();
//        Profile profileById = userDao.getProfileById(1L);
//        System.out.println(profileById.getEmail());
//
//        UserDao userDao = new UserDao();
//        userDao.add(new User("Yarik", "232", true));


//        GroupMembersDao groupMembersDao = new GroupMembersDao();
//        GroupDao groupDao = new GroupDao();
//        GroupMembers groupMembers = new GroupMembers("Ivan", groupDao.getById(2L));
//        groupMembersDao.add(groupMembers);

//        ProfileDao profileDao = new ProfileDao();
//        if (profileDao.isThere("yarik.taleb@gmail.com")){
//            System.out.println("There");
//        } else {
//            System.out.println("NO");
//        }

//        ProfileDao profileDao = new ProfileDao();
//        profileDao.changePassword("4321", "dimas@gmail.com");

//        InstitutionDao institutionDao = new InstitutionDao();
//        List<Institution> allInstitution = institutionDao.getAllInstitution();
//
//        for (Institution institution : allInstitution) {
//            System.out.println(institution.getAddress());
//        }

//        Institution institution1 = new Institution("first", "04444556", "Solom", "<maahch");
//        Institution institution2 = new Institution("second", "04444556", "Solom", "<maahch");
//        Institution institution3 = new Institution("third", "04444556", "Solom", "<maahch");
//
//
//
//        institution1.setServices();

//        TypeListDao typeListDao = new TypeListDao();
//        ArrayList<TypeList> typeLists = new ArrayList<TypeList>();
//
//        typeLists.add(new TypeList("Арт-кафе"));
//        typeLists.add(new TypeList("Банкетный зал"));
//        typeLists.add(new TypeList("Баня"));
//        typeLists.add(new TypeList("Бар"));
//        typeLists.add(new TypeList("Бар-ресторан"));
//        typeLists.add(new TypeList("Бильярд"));
//        typeLists.add(new TypeList("Бистро"));
//        typeLists.add(new TypeList("Блюз-бар"));
//        typeLists.add(new TypeList("Боулинг"));
//        typeLists.add(new TypeList("Брассери"));
//        typeLists.add(new TypeList("Винный ресторан"));
//        typeLists.add(new TypeList("Гостиничный комплекс"));
//        typeLists.add(new TypeList("Гриль-бар"));
//        typeLists.add(new TypeList("Доставка пиццы"));
//        typeLists.add(new TypeList("Еда на вынос"));
//        typeLists.add(new TypeList("Загородный ресторан"));
//        typeLists.add(new TypeList("Закусочная"));
//        typeLists.add(new TypeList("Кабаре"));
//        typeLists.add(new TypeList("Казино"));
//        typeLists.add(new TypeList("Кальянная"));
//        typeLists.add(new TypeList("Караоке"));
//        typeLists.add(new TypeList("Кафе"));
//        typeLists.add(new TypeList("Кафе-бар"));
//        typeLists.add(new TypeList("Кафетерий"));
//        typeLists.add(new TypeList("Кафетерий-ресторан"));
//        typeLists.add(new TypeList("Кейтеринг"));
//        typeLists.add(new TypeList("Клуб"));
//        typeLists.add(new TypeList("Коктейль-бар"));
//        typeLists.add(new TypeList("Кондитерская"));
//        typeLists.add(new TypeList("Кофейня"));
//        typeLists.add(new TypeList("Ночной клуб"));
//        typeLists.add(new TypeList("Паб"));
//        typeLists.add(new TypeList("Пивной бар"));
//        typeLists.add(new TypeList("Пивной ресторан"));
//        typeLists.add(new TypeList("Пивоварня"));
//        typeLists.add(new TypeList("Пиццерия"));
//        typeLists.add(new TypeList("Пре-пати"));
//        typeLists.add(new TypeList("Развлекательный комплекс"));
//        typeLists.add(new TypeList("Ресторан"));
//        typeLists.add(new TypeList("Ресторан при гостинице"));
//        typeLists.add(new TypeList("Ретро-ресторан"));
//        typeLists.add(new TypeList("Рыбный ресторан"));
//        typeLists.add(new TypeList("Сауна"));
//        typeLists.add(new TypeList("Семейный ресторан"));
//        typeLists.add(new TypeList("Сигарный клуб"));
//        typeLists.add(new TypeList("Служба доставки"));
//        typeLists.add(new TypeList("Спорт-бар"));
//        typeLists.add(new TypeList("Столовая"));
//        typeLists.add(new TypeList("Стриптиз-клуб"));
//        typeLists.add(new TypeList("Суши-бар"));
//        typeLists.add(new TypeList("Таверна"));
//        typeLists.add(new TypeList("Тематический ресторан"));
//        typeLists.add(new TypeList("Топлес"));
//        typeLists.add(new TypeList("Фаст-фуд"));
//        typeLists.add(new TypeList("Фуд-корт"));
//        typeLists.add(new TypeList("Чайная"));
//        typeLists.add(new TypeList("Чайный ресторан"));
//        typeLists.add(new TypeList("Шашлычная"));
//        typeLists.add(new TypeList("Шведский стол"));
//
//        typeListDao.addList(typeLists);
//
////      ---------------------------------------------------
//
//        KitchenListDao kitchenListDao = new KitchenListDao();
//        ArrayList<KitchenList> kitchenLists = new ArrayList<KitchenList>();
//
//        kitchenLists.add(new KitchenList("Австрийская"));
//        kitchenLists.add(new KitchenList("Авторская"));
//        kitchenLists.add(new KitchenList("Азербайджанская"));
//        kitchenLists.add(new KitchenList("Азиатская"));
//        kitchenLists.add(new KitchenList("Американская"));
//        kitchenLists.add(new KitchenList("Английская"));
//        kitchenLists.add(new KitchenList("Арабская"));
//        kitchenLists.add(new KitchenList("Армянская"));
//        kitchenLists.add(new KitchenList("Бельгийская"));
//        kitchenLists.add(new KitchenList("Вегетарианская"));
//        kitchenLists.add(new KitchenList("Восточная"));
//        kitchenLists.add(new KitchenList("Выпечка"));
//        kitchenLists.add(new KitchenList("Вьетнамская"));
//        kitchenLists.add(new KitchenList("Греческая"));
//        kitchenLists.add(new KitchenList("Грузинская"));
//        kitchenLists.add(new KitchenList("Домашняя"));
//        kitchenLists.add(new KitchenList("Еврейская"));
//        kitchenLists.add(new KitchenList("Европейская"));
//        kitchenLists.add(new KitchenList("Европейская / Восточная"));
//        kitchenLists.add(new KitchenList("Европейская / Фьюжн"));
//        kitchenLists.add(new KitchenList("Индийская"));
//        kitchenLists.add(new KitchenList("Ирландская"));
//        kitchenLists.add(new KitchenList("Испанская"));
//        kitchenLists.add(new KitchenList("Итальянская"));
//        kitchenLists.add(new KitchenList("Итальянская / Северная"));
//        kitchenLists.add(new KitchenList("Итальянская / Южная"));
//        kitchenLists.add(new KitchenList("Кавказская"));
//        kitchenLists.add(new KitchenList("Карибская"));
//        kitchenLists.add(new KitchenList("Китайская"));
//        kitchenLists.add(new KitchenList("Корейская"));
//        kitchenLists.add(new KitchenList("Кошерная"));
//        kitchenLists.add(new KitchenList("Латиноамериканская"));
//        kitchenLists.add(new KitchenList("Ливанская"));
//        kitchenLists.add(new KitchenList("Марокканская"));
//        kitchenLists.add(new KitchenList("Мексиканская"));
//        kitchenLists.add(new KitchenList("Молдавская"));
//        kitchenLists.add(new KitchenList("Морепродукты"));
//        kitchenLists.add(new KitchenList("Немецкая"));
//        kitchenLists.add(new KitchenList("Пекарня"));
//        kitchenLists.add(new KitchenList("Пивные рестораны"));
//        kitchenLists.add(new KitchenList("Пицца"));
//        kitchenLists.add(new KitchenList("Польская"));
//        kitchenLists.add(new KitchenList("Русская"));
//        kitchenLists.add(new KitchenList("Сендвичи"));
//        kitchenLists.add(new KitchenList("Сербская"));
//        kitchenLists.add(new KitchenList("Средиземноморская"));
//        kitchenLists.add(new KitchenList("Суши"));
//        kitchenLists.add(new KitchenList("Тайская"));
//        kitchenLists.add(new KitchenList("Турецкая"));
//        kitchenLists.add(new KitchenList("Узбекская"));
//        kitchenLists.add(new KitchenList("Украинская"));
//        kitchenLists.add(new KitchenList("Французская"));
//        kitchenLists.add(new KitchenList("Цыпленок"));
//        kitchenLists.add(new KitchenList("Чешская"));
//        kitchenLists.add(new KitchenList("Швейцарская"));
//        kitchenLists.add(new KitchenList("Шотландская"));
//        kitchenLists.add(new KitchenList("Японская"));
//
//        kitchenListDao.addList(kitchenLists);
//
////      ---------------------------------------------------
//
//        ServiceListDao serviceListDao = new ServiceListDao();
//        ArrayList<ServiceList> serviceLists = new ArrayList<ServiceList>();
//
//        serviceLists.add(new ServiceList("Wi-Fi"));
//        serviceLists.add(new ServiceList("А-ля Фуршет"));
//        serviceLists.add(new ServiceList("Баня"));
//        serviceLists.add(new ServiceList("Барбекю"));
//        serviceLists.add(new ServiceList("Без детей"));
//        serviceLists.add(new ServiceList("Бизнес-ланч"));
//        serviceLists.add(new ServiceList("Бильярд"));
//        serviceLists.add(new ServiceList("Боулинг"));
//        serviceLists.add(new ServiceList("Винный бар"));
//        serviceLists.add(new ServiceList("Гриль"));
//        serviceLists.add(new ServiceList("Дартс"));
//        serviceLists.add(new ServiceList("Деловой ужин"));
//        serviceLists.add(new ServiceList("Детский стол"));
//        serviceLists.add(new ServiceList("Диджей"));
//        serviceLists.add(new ServiceList("Дискотека"));
//        serviceLists.add(new ServiceList("Еда на вынос"));
//        serviceLists.add(new ServiceList("Живая музыка"));
//        serviceLists.add(new ServiceList("Известный шеф-повар"));
//        serviceLists.add(new ServiceList("Кальян"));
//        serviceLists.add(new ServiceList("Караоке"));
//        serviceLists.add(new ServiceList("Караоке в кабинете"));
//        serviceLists.add(new ServiceList("Кафетерий"));
//        serviceLists.add(new ServiceList("Кейтеринг"));
//        serviceLists.add(new ServiceList("Круглосуточно"));
//        serviceLists.add(new ServiceList("Летняя площадка"));
//        serviceLists.add(new ServiceList("Место проведения свадьбы"));
//        serviceLists.add(new ServiceList("Молодежный"));
//        serviceLists.add(new ServiceList("На берегу"));
//        serviceLists.add(new ServiceList("Нарды"));
//        serviceLists.add(new ServiceList("Обслуживание банкетов"));
//        serviceLists.add(new ServiceList("Онлайн заказ"));
//        serviceLists.add(new ServiceList("Парковка"));
//        serviceLists.add(new ServiceList("Пивоварня"));
//        serviceLists.add(new ServiceList("Предварительный заказ"));
//        serviceLists.add(new ServiceList("Приватные комнаты"));
//        serviceLists.add(new ServiceList("Приготовление на открытом огне"));
//        serviceLists.add(new ServiceList("Романтичные"));
//        serviceLists.add(new ServiceList("Сауна"));
//        serviceLists.add(new ServiceList("Свое спиртное"));
//        serviceLists.add(new ServiceList("Сигары"));
//        serviceLists.add(new ServiceList("Стриптиз"));
//        serviceLists.add(new ServiceList("Танцпол"));
//        serviceLists.add(new ServiceList("Тематический ресторан"));
//        serviceLists.add(new ServiceList("Топлес"));
//        serviceLists.add(new ServiceList("Фейс-контроль"));
//        serviceLists.add(new ServiceList("Шахматы"));
//        serviceLists.add(new ServiceList("Шашлык"));
//        serviceLists.add(new ServiceList("Шоу-программа"));
//
//
//        serviceListDao.addList(serviceLists);
//
////      ---------------------------------------------------
//
//        RegionListDao regionListDao = new RegionListDao();
//        ArrayList<RegionList> regionLists = new ArrayList<RegionList>();
//
//        regionLists.add(new RegionList("Голосеевский"));
//        regionLists.add(new RegionList("Дарницкий"));
//        regionLists.add(new RegionList("Деснянский "));
//        regionLists.add(new RegionList("Днепровский"));
//        regionLists.add(new RegionList("Оболонский"));
//        regionLists.add(new RegionList("Печерский"));
//        regionLists.add(new RegionList("Подольский"));
//        regionLists.add(new RegionList("Святошинский"));
//        regionLists.add(new RegionList("Соломенский"));
//        regionLists.add(new RegionList("Шевченковский"));
//
//        regionListDao.addList(regionLists);

//        RegionListDao regionListDao = new RegionListDao();
//        for (String s : regionListDao.getAllTitle()) {
//            System.out.println(s);
//        }

//        Institution institution =  new Institution("Барадак", "0444", "22увв", "ул Машиностроительгая");
//        InstitutionDao institutionDao = new InstitutionDao();
//        institutionDao.add(institution);
//
//        ArrayList<Kitchen> kitchens = new ArrayList<Kitchen>();
//        kitchens.add(new Kitchen("украинская", institution));
//        KitchenDao kitchenDao = new KitchenDao();
//        kitchenDao.addList(kitchens);


    }
}

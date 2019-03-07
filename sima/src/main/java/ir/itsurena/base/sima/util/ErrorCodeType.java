package ir.itsurena.base.sima.util;

import java.util.EnumSet;
import java.util.Set;

public enum ErrorCodeType {
    OK(0, "عملیات موفقیت آمیز است"),
    TIME_OUT(10, "در زمان تعریف شده پاسخی از بانک مرکزی دریافت نشد"),
    INVALID_PARAM(11, "پارامترهای ارسالی جهت فراخوانی سرویس، معتبر نمیباشد"),
    INTERNAL_EXCEPTION(12, "بروز خطای داخلی"),
    MISMATCH_EXCEPTION(13, "اطلاعات ارسالی با اطلاعات پایگاه داده همخوانی ندارد"),

    BIC_CODE_IS_NOT_VALID(101, "کد bic ارسال شده در سامانه نهاب تعریف نشده"),
    BIC_CODE_IS_NOT_SENT(102, "کد bic به درستی ارسال نشده"),
    PERSON_DOES_NOT_EXIST(103, "فرد موجود نیست"),
    SENDER_BIC_IS_DIFFERENT_FROM_BIC_FIELD_MENTIONED_IN_THE_REQUEST(104, "کد bic فرستنده با کد bic موجود در درخواست مغایر است"),
    REQUEST_IS_UNDER_INVESTIGATION(105, "درخواست در حال بررسی است"),

    NATIONAL_CODE_IS_NOT_VALID(201, "كدملی نامعتبر است"),
    REAL_BIRTH_DATE_IS_NOT_VALID(202, "تاریخ تولد نامعتبر است"),
    ISSUE_NUMBER_IS_NOT_VALID(203, "شماره شناسنامه نامعتبر است"),
    BIRTH_PLACE_IS_NOT_VALID(204, "كد محل تولد شخص حقیقی نامعتبر است"),
    REAL_SENT_INFO_IS_NOT_VALID(205, "اطلاعات ارسالی شخص حقیقی با اطلاعات موجود در پایگاه داده هماهنگی ندارد"),
    PERSON_INVALIDITY(108, "شخص مورد نظر با آن چند قلم استعلام شده، فاقد اعتباراست"),
    TEMPORARILY_OUT_OF_SERVICE(109, "سامانه نهاب موقتا قادر به استعلام نمیباشد"),

    PERSON_IS_DEAD(206, "فرد با كدملی ارسال شده در قید حیات نیست"),

    LEGAL_SENT_INFO_IS_NOT_VALID(301, "اطلاعات ارسالی شخص حقوقی با اطلاعات همان شخص در پایگاه داده همخوانی ندارد"),
    REGISTER_DATE_IS_NOT_VALID(302, "تاریخ ثبت شرکت ارسال نشده یا با اطلاعات پایگاه داده تداخل دارد"),
    REGISTER_PLACE_IS_NOT_VALID(303, "محل ثبت شركت نامعتبر است"),
    NATIONAL_ID_IS_NOT_VALID(304, "شناسه ملی شركت نامعتبر است"),
    REGISTER_NUMBER_IS_NOT_VALID(305, "شماره ثبت شركت نامعتبر است"),
    CORPORATE_IS_BROKEN_UP(306, "تاریخ فعالیت شركت به پایان رسیده است"),

    FOREIGN_REAL_SENT_INFO_IS_NOT_VALID(401, "اطلاعات ارسالی شخص حقیقی خارجی با اطلاعات همان شخص در پایگاه داده همخوانی ندارد"),
    FOREIGN_BIRTH_DATE_IS_NOT_VALID(402, "تاریخ تولد نامعتبر است"),
    BIRTH_COUNTRY_IS_NOT_VALID(403, "كد كشور محل تولد نامعتبر است"),
    DOCUMENT_ID_NUMBER_IS_NOT_VALID(404, "شماره مدرك شناسایی نامعتبر است"),
    PUBLIC_NUMBER_IS_NOT_VALID(405, "كد فراگیر نامعتبر است"),

    FOREIGN_LEGAL_SENT_INFO_IS_NOT_VALID(501, "اطلاعات ارسالی شخص حقوقی خارجی با اطلاعات همان شخص در پایگاه داده همخوانی ندارد"),
    FOREIGN_REGISTER_DATE_IS_NOT_VALID(502, "تاریخ ثبت نامعتبر است"),
    REGISTER_COUNTRY_IS_NOT_VALID(503, "كشور شركت ثبت شده نامعتبر است"),
    FOREIGN_NATIONAL_ID_IS_NOT_VALID(504, "كد شناسایی نامعتبر است"),
    FOREIGN_REGISTER_NUMBER_IS_NOT_VALID(505, "شماره ثبت نامعتبر است"),

    ACTIVITY_LEVEL_IS_NOT_SENT(601, "عدم ارسال سطح فعالیت"),
    ACTIVITY_LEVEL_MUST_NOT_BE_SENT(602, "سطح فعالیت نباید مقداردهی شود"),
    ACTIVITY_LEVEL_VALUE_IS_INVALID(603, "مقدار وارد شده برای سطح فعالیت نامعتبر است"),

    SHAHAB_CODE_IS_NOT_VALID(635, "كدشهاب نامعتبر است"),
    SHAHAB_CODE_HAS_BEEN_EXPIRED(636, "كد شهاب منقضی شده است"),

    POSTAL_CODE_IS_INVALID(650, "كدپستی نامعتبر است"),

    MESSAGE_PARSING_ERROR(701, "وقوع خطای نحوی در پیمایش پیام ورودی"),
    ENCRYPTED_MESSAGE_MUST_BE_SENT(702, "پیام باید به صورت رمز شده ارسال گردد"),
    MESSAGE_COULD_NOT_BE_VERIFIED(703, "پیام ارسال شده تایید نگردید"),
    MESSAGE_IS_SENT_FROM_AN_UNIDENTIFIED_SOURCE(704, "پیام از سوی منبع معتبر ارسال نشده است"),
    PLAIN_MESSAGE_MUST_BE_SENT(705, "پیام می بایست به صورت ساده ارسال شود"),
    REFERENCE_ID_MUST_BE_UNIQUE(706, "شناسه مرجع ارسال شده در درخواست باید یكتا باشد"),
    REFERENCE_ID_MUST_BE_23_CHARACTERS(707, "شناسه مرجع باید ٢٣ كاراكتر باشد"),
    SYSTEM_CODE_PART_OF_REFERENCE_ID_IS_NOT_VALID(708, "بخش كد سیستم شناسه مرجع نادرست است"),
    BANK_NAME_PART_OF_REFERENCE_ID_IS_NOT_VALID(709, "بخش نام بانك شناسه مرجع نادرست است"),
    DATE_PART_OF_REFERENCE_ID_IS_NOT_VALID(710, "بخش تاریخ شناسه مرجع نادرست است"),
    SEQUENCE_PART_OF_REFERENCE_ID_IS_NOT_VALID(711, "بخش شماره سری شناسه مرجع نادرست است"),
    HAS_NOT_REFERENCE_ID(712, "الزام وجود مقدار شناسه مرجع"),

    MAXIMUM_TRANSACTION_PER_DAY_EXCEEDS(901, "تعداد درخواست ها از حداكثر میزان تعداد تراكنش های سرویس مدنظر در روز فراتر رفته است"),

    UNKNOWN(-1, "نامشخص");

    public static Set<ErrorCodeType> deadList = EnumSet.of(PERSON_IS_DEAD, CORPORATE_IS_BROKEN_UP);
    public static Set<ErrorCodeType> certificateList = EnumSet.of(NATIONAL_CODE_IS_NOT_VALID, REAL_BIRTH_DATE_IS_NOT_VALID,
            ISSUE_NUMBER_IS_NOT_VALID, BIRTH_PLACE_IS_NOT_VALID, REAL_SENT_INFO_IS_NOT_VALID, LEGAL_SENT_INFO_IS_NOT_VALID,
            REGISTER_DATE_IS_NOT_VALID, REGISTER_PLACE_IS_NOT_VALID, NATIONAL_ID_IS_NOT_VALID, REGISTER_NUMBER_IS_NOT_VALID,
            FOREIGN_REAL_SENT_INFO_IS_NOT_VALID, FOREIGN_BIRTH_DATE_IS_NOT_VALID, BIRTH_COUNTRY_IS_NOT_VALID,
            DOCUMENT_ID_NUMBER_IS_NOT_VALID, PUBLIC_NUMBER_IS_NOT_VALID, FOREIGN_LEGAL_SENT_INFO_IS_NOT_VALID,
            FOREIGN_REGISTER_DATE_IS_NOT_VALID, REGISTER_COUNTRY_IS_NOT_VALID, FOREIGN_NATIONAL_ID_IS_NOT_VALID,
            FOREIGN_REGISTER_NUMBER_IS_NOT_VALID);
    public static Set<ErrorCodeType> notExistList = EnumSet.of(PERSON_DOES_NOT_EXIST);
    public final int code;
    public final String persianDesc;

    ErrorCodeType(int code, String persianDesc) {
        this.code = code;
        this.persianDesc = persianDesc;
    }

    public static ErrorCodeType getByCode(int code) {
        ErrorCodeType result = UNKNOWN;

        for (ErrorCodeType errorCode : values()) {
            if (errorCode.code == code) {
                result = errorCode;
            }
        }

        return result;
    }
}

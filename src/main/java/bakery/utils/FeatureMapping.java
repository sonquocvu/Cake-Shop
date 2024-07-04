package bakery.utils;

public class FeatureMapping {
	
    public class DisplayHomePageFeature {

        public static final String HOME_PAGE = "homePage";
    }

    public class SearchAllRecipesFeature {

        public static final String HOME_PAGE = "homePage";
        public static final String SEARCH_RESULT_PAGE = "searchResultPage";
    }

    public class AddNewCommentFeature {

        public static final String DISPLAY_SINGLE_RECIPE_CONTROLLER = "displaySingleRecipeController";
        public static final String ERROR_PAGE = "addCommentErrorPage";
        public static final String LOGIN_PAGE = "loginPage";
    }
    
    public class AddNewReportFeature {

        public static final String DISPLAY_SINGLE_RECIPE_CONTROLLER = "displaySingleRecipeController";
        public static final String ERROR_PAGE = "addCommentErrorPage";
        public static final String LOGIN_PAGE = "loginPage";
    }

    public class LikeFeature {

        public static final String ERROR_PAGE = "addCommentErrorPage";
        public static final String LOGIN_PAGE = "loginPage";
        public static final String DISPLAY_SINGLE_RECIPE_CONTROLLER = "displaySingleRecipeController";
    }

    public class FollowFeature {

        public static final String ERROR_PAGE = "addCommentErrorPage";
        public static final String LOGIN_PAGE = "loginPage";
        public static final String DISPLAY_SINGLE_RECIPE_CONTROLLER = "displaySingleRecipeController";
        public static final String DISPLAY_OTHER_PROFILE_CONTROLLER = "displayOtherUserProfileController";

    }

    public class DisplaySingleRecipeFeature {

        public static final String CHECK_SAVED_RECIPE_CONTROLLER = "checkSavedRecipeController";
        public static final String RECIPE_NOT_FOUND_PAGE = "recipeNotFoundPage";
        public static final String SINGLE_RECIPE_PAGE = "singleRecipePage";
    }

    public class DisplayOwnRecipesFeature {

        public static final String MY_RECIPES_PAGE = "myRecipesPage";
    }

    public class RemoveRecipeFeature {

        public static final String ERROR_PAGE = "errorPage";
    }

    public class LoginFeatures {

        public static final String GET_NOTIFICATION_DATA_CONTROLLER = "getNotificationDataController";
        public static final String DISPLAY_HOME_PAGE_CONTROLLER = "homePage";
        public static final String LOGIN_PAGE = "loginPage";
        public static final String HOME_PAGE_USER = "homePage";
    }

    public class RegisterFeatures {

        public static final String ERROR_PAGE = "registerPage";
//        public static final String LOGIN_PAGE = "loginPage";
        public static final String VERIFY_EMAIL_PAGE = "verifyEmailPage";
    }

    public class Admin {

        public static final String ADMIN_UPDATESINGLERECIPE = "adminUpdateRecipe";
        public static final String ADMIN_HOME = "adminHome";
        public static final String ADMIN_DASHBOARD = "adminDashBoardController";
        public static final String ADMIN_LISTUSER = "adminListAccountController";
        public static final String ADMIN_USDETAIL = "adminUsdetail";
        public static final String ADMIN_LISTRECIPE = "listRecipeAdmin";

    }

    public class DisplayUserProfileFeartures {

        public static final String PROFILE_PAGE = "userProfilePage";
        public static final String USER_HOME_PAGE = "homePage";
    }

    public class ResetPasswordFeartures {

        public static final String RESET_PASSWORD_PAGE = "resetPasswordPage";
        public static final String USER_HOME_PAGE = "homePage";
    }

    public class RemoveAccountFeartures {

        public static final String USER_HOME_PAGE = "homePage";
        public static final String LOGIN_PAGE = "loginPage";
    }

    public class ForgotPaswordFeartures {

        public static final String FORGOT_PASSWORD_PAGE = "forgotPasswordPage";
        public static final String LOGIN_PAGE = "loginPage";
    }

    public class DisplaySubmitRecipeFeature {

        public static final String SUBMIT_RECIPE_PAGE = "submitRecipePage";

    }

    public class CreateRecipeFeature {

        public static final String ERROR_PAGE = "errorPage";
        public static final String MY_RECIPES_PAGE = "displayOwnRecipes";
        public static final String SUBMIT_RECIPE_PAGE = "submitRecipePage";
    }

    public class UpdateUserProfile {

        public static final String USER_PROFILE_PAGE = "userProfilePage";
        public static final String DISPLAY_USER_PROFILE_CONTROLLER = "displayUserProfileController";
    }

    public class DisplayEditRecipeFeature {
        public static final String RECIPE_NOT_FOUND= "recipeNotFoundPage";
        public static final String EDIT_RECIPE_PAGE = "editRecipePage";
    }
    
    public class EditRecipeFeature {
        public static final String RECIPE_NOT_FOUND= "errorPage";
        public static final String EDIT_RECIPE_PAGE = "editRecipePage";
        //success: displaySingleRecipe
    }

    public class EmailFeatures {

        public static final String VERIFY_EMAIL_PAGE = "verifyEmailPage";
        public static final String VERIFY_CODE_PAGE = "verifyCodePage";
    }

    public class VerifyCodeFeatures {

        public static final String LOGIN_PAGE = "loginPage";
        public static final String VERIFY_CODE_PAGE = "verifyCodePage";
    }

     public class SaveRecipe {

        public static final String SEARCH_SAVED_RECIPE_CONTROLLER = "searchSavedRecipeController";
        public static final String SINGLE_RECIPE_PAGE = "singleRecipePage";
        public static final String DISPLAY_SINGLE_REICPE_CONTROLLER = "displaySingleRecipe";
    }
     
    public class NotificationFeartures {
        
        public static final String DISPLAY_HOME_PAGE_CONTROLLER = "homePage";
        public static final String HEADER_USER = "headerUser";
        
    }
    
    public class FollowFeatures {

        public static final String ERROR_PAGE = "addCommentErrorPage";
        public static final String LOGIN_PAGE = "loginPage";
        public static final String DISPLAY_SINGLE_RECIPE_CONTROLLER = "displaySingleRecipeController";

    }
    
    public class DisplaySavedRecipeFeartures {
        
        public static final String USER_PROFILE_PAGE = "userProfilePage";
        public static final String SAVED_RECIPE_PAGE = "savedRecipePage";
        public static final String DISPLAY_SAVED_RECIPE_CONTROLLER = "displaySavedRecipeController";
    }
     
    public class SearchSavedRecipeFeartures {
        
        public static final String SAVED_RECIPE_PAGE = "savedRecipePage";
        public static final String SEARCH_SAVED_RECIPE_PAGE = "searchSavedResultPage";
        public static final String DISPLAY_SAVED_RECIPE_CONTROLLER = "displaySavedRecipeController";
        public static final String SEARCH_SAVED_RECIPE_CONTROLLER = "searchSavedRecipeController";
    }
    
    public class DisplayOtherUserProfileFeartures {
        
        public static final String USER_NOT_FOUND_PAGE = "userNotFoundPage";
        public static final String USER_PROFILE_PAGE = "otherUserProfilePage";
    }

}

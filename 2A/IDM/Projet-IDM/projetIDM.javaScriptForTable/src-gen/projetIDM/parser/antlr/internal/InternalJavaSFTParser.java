package projetIDM.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import projetIDM.services.JavaSFTGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJavaSFTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_TYPE_STRING", "RULE_TYPE_INTEGER", "RULE_TYPE_FLOAT", "RULE_ID", "RULE_SPACE", "RULE_SIZEVAR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'ArrayList<'", "'>'", "'import'", "'java.util.ArrayList;'", "'java.util.List;'", "'java.util.Collections;'", "'java.util.stream.Collectors;'", "'java.util.stream.IntStream;'", "'JavaSFT'", "'public'", "'class'", "'{'", "'}'", "'static'", "'List<'", "'getResult('", "')'", "'int'", "'='", "'.size();'", "','", "'return'", "';'", "'final'", "'.valueOf('", "'.stream().reduce((s,e)->s+e).get();'", "'.stream().reduce((s,e)->s*e).get();'", "'Collections.min('", "'Collections.max('", "'('", "'.stream().map(e->-e).collect(Collectors.toList());'", "'-'", "'.stream().map(e->(float)Math.cos(e)).collect(Collectors.toList());'", "'(float)Math.cos('", "'.stream().map(e->(float)Math.sin(e)).collect(Collectors.toList());'", "'(float)Math.sin('", "'.stream().map(e->(float)Math.sqrt(e)).collect(Collectors.toList());'", "'(float)Math.sqrt('", "'.stream().map(e->(float)Math.exp(e)).collect(Collectors.toList());'", "'(float)Math.exp('", "'.stream().map(e->e+'", "').collect(Collectors.toList());'", "'IntStream.range(0,'", "').mapToObj(i->'", "'.get(i)+'", "'.get(i)).collect(Collectors.toList());'", "'+'", "'.stream().map(e->e*'", "'.get(i)*'", "'*'", "'.stream().map(e->e/'", "'.stream().map(e->'", "'/e).collect(Collectors.toList());'", "'.get(i)/'", "'/'", "'.stream().map(e->Math.min(e,'", "')).collect(Collectors.toList());'", "').mapToObj(i->Math.min('", "'.get(i),'", "'.get(i))).collect(Collectors.toList());'", "'Math.min('", "'.stream().map(e->Math.max(e,'", "').mapToObj(i->Math.max('", "'Math.max('"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_SPACE=10;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_SIZEVAR=11;
    public static final int T__37=37;
    public static final int RULE_TYPE_STRING=6;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int RULE_TYPE_INTEGER=7;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_WS=14;
    public static final int RULE_TYPE_FLOAT=8;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalJavaSFTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJavaSFTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJavaSFTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJavaSFT.g"; }



     	private JavaSFTGrammarAccess grammarAccess;

        public InternalJavaSFTParser(TokenStream input, JavaSFTGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "JavaSFT";
       	}

       	@Override
       	protected JavaSFTGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJavaSFT"
    // InternalJavaSFT.g:64:1: entryRuleJavaSFT returns [EObject current=null] : iv_ruleJavaSFT= ruleJavaSFT EOF ;
    public final EObject entryRuleJavaSFT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaSFT = null;


        try {
            // InternalJavaSFT.g:64:48: (iv_ruleJavaSFT= ruleJavaSFT EOF )
            // InternalJavaSFT.g:65:2: iv_ruleJavaSFT= ruleJavaSFT EOF
            {
             newCompositeNode(grammarAccess.getJavaSFTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJavaSFT=ruleJavaSFT();

            state._fsp--;

             current =iv_ruleJavaSFT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJavaSFT"


    // $ANTLR start "ruleJavaSFT"
    // InternalJavaSFT.g:71:1: ruleJavaSFT returns [EObject current=null] : ( ruleImport this_Class_1= ruleClass ) ;
    public final EObject ruleJavaSFT() throws RecognitionException {
        EObject current = null;

        EObject this_Class_1 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:77:2: ( ( ruleImport this_Class_1= ruleClass ) )
            // InternalJavaSFT.g:78:2: ( ruleImport this_Class_1= ruleClass )
            {
            // InternalJavaSFT.g:78:2: ( ruleImport this_Class_1= ruleClass )
            // InternalJavaSFT.g:79:3: ruleImport this_Class_1= ruleClass
            {

            			newCompositeNode(grammarAccess.getJavaSFTAccess().getImportParserRuleCall_0());
            		
            pushFollow(FOLLOW_3);
            ruleImport();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getJavaSFTAccess().getClassParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Class_1=ruleClass();

            state._fsp--;


            			current = this_Class_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJavaSFT"


    // $ANTLR start "entryRuleValue"
    // InternalJavaSFT.g:98:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalJavaSFT.g:98:45: (iv_ruleValue= ruleValue EOF )
            // InternalJavaSFT.g:99:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalJavaSFT.g:105:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Float_0= ruleFloat | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_1=null;
        Token this_STRING_2=null;
        AntlrDatatypeRuleToken this_Float_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:111:2: ( (this_Float_0= ruleFloat | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING ) )
            // InternalJavaSFT.g:112:2: (this_Float_0= ruleFloat | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            {
            // InternalJavaSFT.g:112:2: (this_Float_0= ruleFloat | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_INT) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==EOF||LA1_1==33) ) {
                    alt1=2;
                }
                else if ( (LA1_1==16) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalJavaSFT.g:113:3: this_Float_0= ruleFloat
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getFloatParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Float_0=ruleFloat();

                    state._fsp--;


                    			current.merge(this_Float_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:124:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getValueAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalJavaSFT.g:132:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleFloat"
    // InternalJavaSFT.g:143:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalJavaSFT.g:143:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalJavaSFT.g:144:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalJavaSFT.g:150:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalJavaSFT.g:156:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalJavaSFT.g:157:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalJavaSFT.g:157:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalJavaSFT.g:158:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,16,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleType"
    // InternalJavaSFT.g:181:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalJavaSFT.g:181:44: (iv_ruleType= ruleType EOF )
            // InternalJavaSFT.g:182:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalJavaSFT.g:188:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TypeNumber_0= ruleTypeNumber | this_TYPE_STRING_1= RULE_TYPE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TYPE_STRING_1=null;
        AntlrDatatypeRuleToken this_TypeNumber_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:194:2: ( (this_TypeNumber_0= ruleTypeNumber | this_TYPE_STRING_1= RULE_TYPE_STRING ) )
            // InternalJavaSFT.g:195:2: (this_TypeNumber_0= ruleTypeNumber | this_TYPE_STRING_1= RULE_TYPE_STRING )
            {
            // InternalJavaSFT.g:195:2: (this_TypeNumber_0= ruleTypeNumber | this_TYPE_STRING_1= RULE_TYPE_STRING )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_TYPE_INTEGER && LA2_0<=RULE_TYPE_FLOAT)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_TYPE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJavaSFT.g:196:3: this_TypeNumber_0= ruleTypeNumber
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getTypeNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeNumber_0=ruleTypeNumber();

                    state._fsp--;


                    			current.merge(this_TypeNumber_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:207:3: this_TYPE_STRING_1= RULE_TYPE_STRING
                    {
                    this_TYPE_STRING_1=(Token)match(input,RULE_TYPE_STRING,FOLLOW_2); 

                    			current.merge(this_TYPE_STRING_1);
                    		

                    			newLeafNode(this_TYPE_STRING_1, grammarAccess.getTypeAccess().getTYPE_STRINGTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeNumber"
    // InternalJavaSFT.g:218:1: entryRuleTypeNumber returns [String current=null] : iv_ruleTypeNumber= ruleTypeNumber EOF ;
    public final String entryRuleTypeNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeNumber = null;


        try {
            // InternalJavaSFT.g:218:50: (iv_ruleTypeNumber= ruleTypeNumber EOF )
            // InternalJavaSFT.g:219:2: iv_ruleTypeNumber= ruleTypeNumber EOF
            {
             newCompositeNode(grammarAccess.getTypeNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeNumber=ruleTypeNumber();

            state._fsp--;

             current =iv_ruleTypeNumber.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeNumber"


    // $ANTLR start "ruleTypeNumber"
    // InternalJavaSFT.g:225:1: ruleTypeNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TYPE_INTEGER_0= RULE_TYPE_INTEGER | this_TYPE_FLOAT_1= RULE_TYPE_FLOAT ) ;
    public final AntlrDatatypeRuleToken ruleTypeNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TYPE_INTEGER_0=null;
        Token this_TYPE_FLOAT_1=null;


        	enterRule();

        try {
            // InternalJavaSFT.g:231:2: ( (this_TYPE_INTEGER_0= RULE_TYPE_INTEGER | this_TYPE_FLOAT_1= RULE_TYPE_FLOAT ) )
            // InternalJavaSFT.g:232:2: (this_TYPE_INTEGER_0= RULE_TYPE_INTEGER | this_TYPE_FLOAT_1= RULE_TYPE_FLOAT )
            {
            // InternalJavaSFT.g:232:2: (this_TYPE_INTEGER_0= RULE_TYPE_INTEGER | this_TYPE_FLOAT_1= RULE_TYPE_FLOAT )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_TYPE_INTEGER) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_TYPE_FLOAT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJavaSFT.g:233:3: this_TYPE_INTEGER_0= RULE_TYPE_INTEGER
                    {
                    this_TYPE_INTEGER_0=(Token)match(input,RULE_TYPE_INTEGER,FOLLOW_2); 

                    			current.merge(this_TYPE_INTEGER_0);
                    		

                    			newLeafNode(this_TYPE_INTEGER_0, grammarAccess.getTypeNumberAccess().getTYPE_INTEGERTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:241:3: this_TYPE_FLOAT_1= RULE_TYPE_FLOAT
                    {
                    this_TYPE_FLOAT_1=(Token)match(input,RULE_TYPE_FLOAT,FOLLOW_2); 

                    			current.merge(this_TYPE_FLOAT_1);
                    		

                    			newLeafNode(this_TYPE_FLOAT_1, grammarAccess.getTypeNumberAccess().getTYPE_FLOATTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeNumber"


    // $ANTLR start "entryRuleTypeList"
    // InternalJavaSFT.g:252:1: entryRuleTypeList returns [EObject current=null] : iv_ruleTypeList= ruleTypeList EOF ;
    public final EObject entryRuleTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeList = null;


        try {
            // InternalJavaSFT.g:252:49: (iv_ruleTypeList= ruleTypeList EOF )
            // InternalJavaSFT.g:253:2: iv_ruleTypeList= ruleTypeList EOF
            {
             newCompositeNode(grammarAccess.getTypeListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeList=ruleTypeList();

            state._fsp--;

             current =iv_ruleTypeList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeList"


    // $ANTLR start "ruleTypeList"
    // InternalJavaSFT.g:259:1: ruleTypeList returns [EObject current=null] : (otherlv_0= 'ArrayList<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) ;
    public final EObject ruleTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:265:2: ( (otherlv_0= 'ArrayList<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' ) )
            // InternalJavaSFT.g:266:2: (otherlv_0= 'ArrayList<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            {
            // InternalJavaSFT.g:266:2: (otherlv_0= 'ArrayList<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>' )
            // InternalJavaSFT.g:267:3: otherlv_0= 'ArrayList<' ( (lv_type_1_0= ruleType ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeListAccess().getArrayListKeyword_0());
            		
            // InternalJavaSFT.g:271:3: ( (lv_type_1_0= ruleType ) )
            // InternalJavaSFT.g:272:4: (lv_type_1_0= ruleType )
            {
            // InternalJavaSFT.g:272:4: (lv_type_1_0= ruleType )
            // InternalJavaSFT.g:273:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getTypeListAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeListRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"projetIDM.JavaSFT.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeListAccess().getGreaterThanSignKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeList"


    // $ANTLR start "entryRuleTypeListNumber"
    // InternalJavaSFT.g:298:1: entryRuleTypeListNumber returns [EObject current=null] : iv_ruleTypeListNumber= ruleTypeListNumber EOF ;
    public final EObject entryRuleTypeListNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeListNumber = null;


        try {
            // InternalJavaSFT.g:298:55: (iv_ruleTypeListNumber= ruleTypeListNumber EOF )
            // InternalJavaSFT.g:299:2: iv_ruleTypeListNumber= ruleTypeListNumber EOF
            {
             newCompositeNode(grammarAccess.getTypeListNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeListNumber=ruleTypeListNumber();

            state._fsp--;

             current =iv_ruleTypeListNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeListNumber"


    // $ANTLR start "ruleTypeListNumber"
    // InternalJavaSFT.g:305:1: ruleTypeListNumber returns [EObject current=null] : (otherlv_0= 'ArrayList<' ( (lv_type_1_0= ruleTypeNumber ) ) otherlv_2= '>' ) ;
    public final EObject ruleTypeListNumber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:311:2: ( (otherlv_0= 'ArrayList<' ( (lv_type_1_0= ruleTypeNumber ) ) otherlv_2= '>' ) )
            // InternalJavaSFT.g:312:2: (otherlv_0= 'ArrayList<' ( (lv_type_1_0= ruleTypeNumber ) ) otherlv_2= '>' )
            {
            // InternalJavaSFT.g:312:2: (otherlv_0= 'ArrayList<' ( (lv_type_1_0= ruleTypeNumber ) ) otherlv_2= '>' )
            // InternalJavaSFT.g:313:3: otherlv_0= 'ArrayList<' ( (lv_type_1_0= ruleTypeNumber ) ) otherlv_2= '>'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeListNumberAccess().getArrayListKeyword_0());
            		
            // InternalJavaSFT.g:317:3: ( (lv_type_1_0= ruleTypeNumber ) )
            // InternalJavaSFT.g:318:4: (lv_type_1_0= ruleTypeNumber )
            {
            // InternalJavaSFT.g:318:4: (lv_type_1_0= ruleTypeNumber )
            // InternalJavaSFT.g:319:5: lv_type_1_0= ruleTypeNumber
            {

            					newCompositeNode(grammarAccess.getTypeListNumberAccess().getTypeTypeNumberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_1_0=ruleTypeNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTypeListNumberRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"projetIDM.JavaSFT.TypeNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeListNumberAccess().getGreaterThanSignKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeListNumber"


    // $ANTLR start "entryRuleImport"
    // InternalJavaSFT.g:344:1: entryRuleImport returns [String current=null] : iv_ruleImport= ruleImport EOF ;
    public final String entryRuleImport() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImport = null;


        try {
            // InternalJavaSFT.g:344:46: (iv_ruleImport= ruleImport EOF )
            // InternalJavaSFT.g:345:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalJavaSFT.g:351:1: ruleImport returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'import' kw= 'java.util.ArrayList;' kw= 'import' kw= 'java.util.List;' kw= 'import' kw= 'java.util.Collections;' kw= 'import' kw= 'java.util.stream.Collectors;' kw= 'import' kw= 'java.util.stream.IntStream;' ) ;
    public final AntlrDatatypeRuleToken ruleImport() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalJavaSFT.g:357:2: ( (kw= 'import' kw= 'java.util.ArrayList;' kw= 'import' kw= 'java.util.List;' kw= 'import' kw= 'java.util.Collections;' kw= 'import' kw= 'java.util.stream.Collectors;' kw= 'import' kw= 'java.util.stream.IntStream;' ) )
            // InternalJavaSFT.g:358:2: (kw= 'import' kw= 'java.util.ArrayList;' kw= 'import' kw= 'java.util.List;' kw= 'import' kw= 'java.util.Collections;' kw= 'import' kw= 'java.util.stream.Collectors;' kw= 'import' kw= 'java.util.stream.IntStream;' )
            {
            // InternalJavaSFT.g:358:2: (kw= 'import' kw= 'java.util.ArrayList;' kw= 'import' kw= 'java.util.List;' kw= 'import' kw= 'java.util.Collections;' kw= 'import' kw= 'java.util.stream.Collectors;' kw= 'import' kw= 'java.util.stream.IntStream;' )
            // InternalJavaSFT.g:359:3: kw= 'import' kw= 'java.util.ArrayList;' kw= 'import' kw= 'java.util.List;' kw= 'import' kw= 'java.util.Collections;' kw= 'import' kw= 'java.util.stream.Collectors;' kw= 'import' kw= 'java.util.stream.IntStream;'
            {
            kw=(Token)match(input,19,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            kw=(Token)match(input,20,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImportAccess().getJavaUtilArrayListKeyword_1());
            		
            kw=(Token)match(input,19,FOLLOW_11); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImportAccess().getImportKeyword_2());
            		
            kw=(Token)match(input,21,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImportAccess().getJavaUtilListKeyword_3());
            		
            kw=(Token)match(input,19,FOLLOW_12); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImportAccess().getImportKeyword_4());
            		
            kw=(Token)match(input,22,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImportAccess().getJavaUtilCollectionsKeyword_5());
            		
            kw=(Token)match(input,19,FOLLOW_13); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImportAccess().getImportKeyword_6());
            		
            kw=(Token)match(input,23,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImportAccess().getJavaUtilStreamCollectorsKeyword_7());
            		
            kw=(Token)match(input,19,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImportAccess().getImportKeyword_8());
            		
            kw=(Token)match(input,24,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getImportAccess().getJavaUtilStreamIntStreamKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleClassName"
    // InternalJavaSFT.g:413:1: entryRuleClassName returns [EObject current=null] : iv_ruleClassName= ruleClassName EOF ;
    public final EObject entryRuleClassName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassName = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalJavaSFT.g:415:2: (iv_ruleClassName= ruleClassName EOF )
            // InternalJavaSFT.g:416:2: iv_ruleClassName= ruleClassName EOF
            {
             newCompositeNode(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassName=ruleClassName();

            state._fsp--;

             current =iv_ruleClassName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleClassName"


    // $ANTLR start "ruleClassName"
    // InternalJavaSFT.g:425:1: ruleClassName returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'JavaSFT' ) ;
    public final EObject ruleClassName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalJavaSFT.g:432:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'JavaSFT' ) )
            // InternalJavaSFT.g:433:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'JavaSFT' )
            {
            // InternalJavaSFT.g:433:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'JavaSFT' )
            // InternalJavaSFT.g:434:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'JavaSFT'
            {
            // InternalJavaSFT.g:434:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalJavaSFT.g:435:4: (lv_name_0_0= RULE_ID )
            {
            // InternalJavaSFT.g:435:4: (lv_name_0_0= RULE_ID )
            // InternalJavaSFT.g:436:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_0_0, grammarAccess.getClassNameAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getClassNameAccess().getJavaSFTKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleClassName"


    // $ANTLR start "entryRuleClass"
    // InternalJavaSFT.g:463:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalJavaSFT.g:463:46: (iv_ruleClass= ruleClass EOF )
            // InternalJavaSFT.g:464:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalJavaSFT.g:470:1: ruleClass returns [EObject current=null] : (otherlv_0= 'public' otherlv_1= 'class' ( (lv_className_2_0= ruleClassName ) ) otherlv_3= '{' ( (lv_methode_4_0= ruleMethode ) ) otherlv_5= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_className_2_0 = null;

        EObject lv_methode_4_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:476:2: ( (otherlv_0= 'public' otherlv_1= 'class' ( (lv_className_2_0= ruleClassName ) ) otherlv_3= '{' ( (lv_methode_4_0= ruleMethode ) ) otherlv_5= '}' ) )
            // InternalJavaSFT.g:477:2: (otherlv_0= 'public' otherlv_1= 'class' ( (lv_className_2_0= ruleClassName ) ) otherlv_3= '{' ( (lv_methode_4_0= ruleMethode ) ) otherlv_5= '}' )
            {
            // InternalJavaSFT.g:477:2: (otherlv_0= 'public' otherlv_1= 'class' ( (lv_className_2_0= ruleClassName ) ) otherlv_3= '{' ( (lv_methode_4_0= ruleMethode ) ) otherlv_5= '}' )
            // InternalJavaSFT.g:478:3: otherlv_0= 'public' otherlv_1= 'class' ( (lv_className_2_0= ruleClassName ) ) otherlv_3= '{' ( (lv_methode_4_0= ruleMethode ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getClassAccess().getPublicKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalJavaSFT.g:486:3: ( (lv_className_2_0= ruleClassName ) )
            // InternalJavaSFT.g:487:4: (lv_className_2_0= ruleClassName )
            {
            // InternalJavaSFT.g:487:4: (lv_className_2_0= ruleClassName )
            // InternalJavaSFT.g:488:5: lv_className_2_0= ruleClassName
            {

            					newCompositeNode(grammarAccess.getClassAccess().getClassNameClassNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_className_2_0=ruleClassName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"className",
            						lv_className_2_0,
            						"projetIDM.JavaSFT.ClassName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJavaSFT.g:509:3: ( (lv_methode_4_0= ruleMethode ) )
            // InternalJavaSFT.g:510:4: (lv_methode_4_0= ruleMethode )
            {
            // InternalJavaSFT.g:510:4: (lv_methode_4_0= ruleMethode )
            // InternalJavaSFT.g:511:5: lv_methode_4_0= ruleMethode
            {

            					newCompositeNode(grammarAccess.getClassAccess().getMethodeMethodeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_methode_4_0=ruleMethode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"methode",
            						lv_methode_4_0,
            						"projetIDM.JavaSFT.Methode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleMethode"
    // InternalJavaSFT.g:536:1: entryRuleMethode returns [EObject current=null] : iv_ruleMethode= ruleMethode EOF ;
    public final EObject entryRuleMethode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethode = null;


        try {
            // InternalJavaSFT.g:536:48: (iv_ruleMethode= ruleMethode EOF )
            // InternalJavaSFT.g:537:2: iv_ruleMethode= ruleMethode EOF
            {
             newCompositeNode(grammarAccess.getMethodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethode=ruleMethode();

            state._fsp--;

             current =iv_ruleMethode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethode"


    // $ANTLR start "ruleMethode"
    // InternalJavaSFT.g:543:1: ruleMethode returns [EObject current=null] : (otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'List<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' otherlv_5= 'getResult(' (this_SPACE_6= RULE_SPACE | ( ( (lv_parameter_7_0= ruleParameter ) ) ( (lv_parameters_8_0= ruleParameter ) )* ) ) otherlv_9= ')' otherlv_10= '{' otherlv_11= 'int' this_SIZEVAR_12= RULE_SIZEVAR otherlv_13= '=' ( (lv_listName_14_0= RULE_ID ) ) otherlv_15= '.size();' ( (lv_constants_16_0= ruleConstant ) )* ( (lv_operations_17_0= ruleOperation ) )* ( (lv_return_18_0= ruleReturn ) ) otherlv_19= '}' ) ;
    public final EObject ruleMethode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_SPACE_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_SIZEVAR_12=null;
        Token otherlv_13=null;
        Token lv_listName_14_0=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        EObject lv_parameter_7_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_constants_16_0 = null;

        EObject lv_operations_17_0 = null;

        EObject lv_return_18_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:549:2: ( (otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'List<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' otherlv_5= 'getResult(' (this_SPACE_6= RULE_SPACE | ( ( (lv_parameter_7_0= ruleParameter ) ) ( (lv_parameters_8_0= ruleParameter ) )* ) ) otherlv_9= ')' otherlv_10= '{' otherlv_11= 'int' this_SIZEVAR_12= RULE_SIZEVAR otherlv_13= '=' ( (lv_listName_14_0= RULE_ID ) ) otherlv_15= '.size();' ( (lv_constants_16_0= ruleConstant ) )* ( (lv_operations_17_0= ruleOperation ) )* ( (lv_return_18_0= ruleReturn ) ) otherlv_19= '}' ) )
            // InternalJavaSFT.g:550:2: (otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'List<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' otherlv_5= 'getResult(' (this_SPACE_6= RULE_SPACE | ( ( (lv_parameter_7_0= ruleParameter ) ) ( (lv_parameters_8_0= ruleParameter ) )* ) ) otherlv_9= ')' otherlv_10= '{' otherlv_11= 'int' this_SIZEVAR_12= RULE_SIZEVAR otherlv_13= '=' ( (lv_listName_14_0= RULE_ID ) ) otherlv_15= '.size();' ( (lv_constants_16_0= ruleConstant ) )* ( (lv_operations_17_0= ruleOperation ) )* ( (lv_return_18_0= ruleReturn ) ) otherlv_19= '}' )
            {
            // InternalJavaSFT.g:550:2: (otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'List<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' otherlv_5= 'getResult(' (this_SPACE_6= RULE_SPACE | ( ( (lv_parameter_7_0= ruleParameter ) ) ( (lv_parameters_8_0= ruleParameter ) )* ) ) otherlv_9= ')' otherlv_10= '{' otherlv_11= 'int' this_SIZEVAR_12= RULE_SIZEVAR otherlv_13= '=' ( (lv_listName_14_0= RULE_ID ) ) otherlv_15= '.size();' ( (lv_constants_16_0= ruleConstant ) )* ( (lv_operations_17_0= ruleOperation ) )* ( (lv_return_18_0= ruleReturn ) ) otherlv_19= '}' )
            // InternalJavaSFT.g:551:3: otherlv_0= 'public' otherlv_1= 'static' otherlv_2= 'List<' ( (lv_type_3_0= ruleType ) ) otherlv_4= '>' otherlv_5= 'getResult(' (this_SPACE_6= RULE_SPACE | ( ( (lv_parameter_7_0= ruleParameter ) ) ( (lv_parameters_8_0= ruleParameter ) )* ) ) otherlv_9= ')' otherlv_10= '{' otherlv_11= 'int' this_SIZEVAR_12= RULE_SIZEVAR otherlv_13= '=' ( (lv_listName_14_0= RULE_ID ) ) otherlv_15= '.size();' ( (lv_constants_16_0= ruleConstant ) )* ( (lv_operations_17_0= ruleOperation ) )* ( (lv_return_18_0= ruleReturn ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodeAccess().getPublicKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getMethodeAccess().getStaticKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodeAccess().getListKeyword_2());
            		
            // InternalJavaSFT.g:563:3: ( (lv_type_3_0= ruleType ) )
            // InternalJavaSFT.g:564:4: (lv_type_3_0= ruleType )
            {
            // InternalJavaSFT.g:564:4: (lv_type_3_0= ruleType )
            // InternalJavaSFT.g:565:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getMethodeAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"projetIDM.JavaSFT.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getMethodeAccess().getGreaterThanSignKeyword_4());
            		
            otherlv_5=(Token)match(input,32,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodeAccess().getGetResultKeyword_5());
            		
            // InternalJavaSFT.g:590:3: (this_SPACE_6= RULE_SPACE | ( ( (lv_parameter_7_0= ruleParameter ) ) ( (lv_parameters_8_0= ruleParameter ) )* ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_SPACE) ) {
                alt5=1;
            }
            else if ( (LA5_0==37) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalJavaSFT.g:591:4: this_SPACE_6= RULE_SPACE
                    {
                    this_SPACE_6=(Token)match(input,RULE_SPACE,FOLLOW_24); 

                    				newLeafNode(this_SPACE_6, grammarAccess.getMethodeAccess().getSPACETerminalRuleCall_6_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:596:4: ( ( (lv_parameter_7_0= ruleParameter ) ) ( (lv_parameters_8_0= ruleParameter ) )* )
                    {
                    // InternalJavaSFT.g:596:4: ( ( (lv_parameter_7_0= ruleParameter ) ) ( (lv_parameters_8_0= ruleParameter ) )* )
                    // InternalJavaSFT.g:597:5: ( (lv_parameter_7_0= ruleParameter ) ) ( (lv_parameters_8_0= ruleParameter ) )*
                    {
                    // InternalJavaSFT.g:597:5: ( (lv_parameter_7_0= ruleParameter ) )
                    // InternalJavaSFT.g:598:6: (lv_parameter_7_0= ruleParameter )
                    {
                    // InternalJavaSFT.g:598:6: (lv_parameter_7_0= ruleParameter )
                    // InternalJavaSFT.g:599:7: lv_parameter_7_0= ruleParameter
                    {

                    							newCompositeNode(grammarAccess.getMethodeAccess().getParameterParameterParserRuleCall_6_1_0_0());
                    						
                    pushFollow(FOLLOW_25);
                    lv_parameter_7_0=ruleParameter();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getMethodeRule());
                    							}
                    							set(
                    								current,
                    								"parameter",
                    								lv_parameter_7_0,
                    								"projetIDM.JavaSFT.Parameter");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalJavaSFT.g:616:5: ( (lv_parameters_8_0= ruleParameter ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==37) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalJavaSFT.g:617:6: (lv_parameters_8_0= ruleParameter )
                    	    {
                    	    // InternalJavaSFT.g:617:6: (lv_parameters_8_0= ruleParameter )
                    	    // InternalJavaSFT.g:618:7: lv_parameters_8_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodeAccess().getParametersParameterParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_parameters_8_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_8_0,
                    	    								"projetIDM.JavaSFT.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,33,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getMethodeAccess().getRightParenthesisKeyword_7());
            		
            otherlv_10=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getMethodeAccess().getLeftCurlyBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_11, grammarAccess.getMethodeAccess().getIntKeyword_9());
            		
            this_SIZEVAR_12=(Token)match(input,RULE_SIZEVAR,FOLLOW_28); 

            			newLeafNode(this_SIZEVAR_12, grammarAccess.getMethodeAccess().getSIZEVARTerminalRuleCall_10());
            		
            otherlv_13=(Token)match(input,35,FOLLOW_17); 

            			newLeafNode(otherlv_13, grammarAccess.getMethodeAccess().getEqualsSignKeyword_11());
            		
            // InternalJavaSFT.g:657:3: ( (lv_listName_14_0= RULE_ID ) )
            // InternalJavaSFT.g:658:4: (lv_listName_14_0= RULE_ID )
            {
            // InternalJavaSFT.g:658:4: (lv_listName_14_0= RULE_ID )
            // InternalJavaSFT.g:659:5: lv_listName_14_0= RULE_ID
            {
            lv_listName_14_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_listName_14_0, grammarAccess.getMethodeAccess().getListNameIDTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listName",
            						lv_listName_14_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_15=(Token)match(input,36,FOLLOW_30); 

            			newLeafNode(otherlv_15, grammarAccess.getMethodeAccess().getSizeKeyword_13());
            		
            // InternalJavaSFT.g:679:3: ( (lv_constants_16_0= ruleConstant ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==40) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJavaSFT.g:680:4: (lv_constants_16_0= ruleConstant )
            	    {
            	    // InternalJavaSFT.g:680:4: (lv_constants_16_0= ruleConstant )
            	    // InternalJavaSFT.g:681:5: lv_constants_16_0= ruleConstant
            	    {

            	    					newCompositeNode(grammarAccess.getMethodeAccess().getConstantsConstantParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_constants_16_0=ruleConstant();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMethodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constants",
            	    						lv_constants_16_0,
            	    						"projetIDM.JavaSFT.Constant");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalJavaSFT.g:698:3: ( (lv_operations_17_0= ruleOperation ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_TYPE_STRING && LA7_0<=RULE_TYPE_FLOAT)||LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalJavaSFT.g:699:4: (lv_operations_17_0= ruleOperation )
            	    {
            	    // InternalJavaSFT.g:699:4: (lv_operations_17_0= ruleOperation )
            	    // InternalJavaSFT.g:700:5: lv_operations_17_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getMethodeAccess().getOperationsOperationParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_operations_17_0=ruleOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMethodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_17_0,
            	    						"projetIDM.JavaSFT.Operation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalJavaSFT.g:717:3: ( (lv_return_18_0= ruleReturn ) )
            // InternalJavaSFT.g:718:4: (lv_return_18_0= ruleReturn )
            {
            // InternalJavaSFT.g:718:4: (lv_return_18_0= ruleReturn )
            // InternalJavaSFT.g:719:5: lv_return_18_0= ruleReturn
            {

            					newCompositeNode(grammarAccess.getMethodeAccess().getReturnReturnParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_19);
            lv_return_18_0=ruleReturn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodeRule());
            					}
            					set(
            						current,
            						"return",
            						lv_return_18_0,
            						"projetIDM.JavaSFT.Return");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getMethodeAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethode"


    // $ANTLR start "entryRuleParameter"
    // InternalJavaSFT.g:744:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalJavaSFT.g:744:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalJavaSFT.g:745:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalJavaSFT.g:751:1: ruleParameter returns [EObject current=null] : (otherlv_0= ',' otherlv_1= 'List<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ( (lv_varName_4_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_varName_4_0=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:757:2: ( (otherlv_0= ',' otherlv_1= 'List<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ( (lv_varName_4_0= RULE_ID ) ) ) )
            // InternalJavaSFT.g:758:2: (otherlv_0= ',' otherlv_1= 'List<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ( (lv_varName_4_0= RULE_ID ) ) )
            {
            // InternalJavaSFT.g:758:2: (otherlv_0= ',' otherlv_1= 'List<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ( (lv_varName_4_0= RULE_ID ) ) )
            // InternalJavaSFT.g:759:3: otherlv_0= ',' otherlv_1= 'List<' ( (lv_type_2_0= ruleType ) ) otherlv_3= '>' ( (lv_varName_4_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getCommaKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getListKeyword_1());
            		
            // InternalJavaSFT.g:767:3: ( (lv_type_2_0= ruleType ) )
            // InternalJavaSFT.g:768:4: (lv_type_2_0= ruleType )
            {
            // InternalJavaSFT.g:768:4: (lv_type_2_0= ruleType )
            // InternalJavaSFT.g:769:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"projetIDM.JavaSFT.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getGreaterThanSignKeyword_3());
            		
            // InternalJavaSFT.g:790:3: ( (lv_varName_4_0= RULE_ID ) )
            // InternalJavaSFT.g:791:4: (lv_varName_4_0= RULE_ID )
            {
            // InternalJavaSFT.g:791:4: (lv_varName_4_0= RULE_ID )
            // InternalJavaSFT.g:792:5: lv_varName_4_0= RULE_ID
            {
            lv_varName_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_varName_4_0, grammarAccess.getParameterAccess().getVarNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleReturn"
    // InternalJavaSFT.g:812:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalJavaSFT.g:812:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalJavaSFT.g:813:2: iv_ruleReturn= ruleReturn EOF
            {
             newCompositeNode(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturn=ruleReturn();

            state._fsp--;

             current =iv_ruleReturn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalJavaSFT.g:819:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_varName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_1_0=null;


        	enterRule();

        try {
            // InternalJavaSFT.g:825:2: ( (otherlv_0= 'return' ( (lv_varName_1_0= RULE_ID ) ) ) )
            // InternalJavaSFT.g:826:2: (otherlv_0= 'return' ( (lv_varName_1_0= RULE_ID ) ) )
            {
            // InternalJavaSFT.g:826:2: (otherlv_0= 'return' ( (lv_varName_1_0= RULE_ID ) ) )
            // InternalJavaSFT.g:827:3: otherlv_0= 'return' ( (lv_varName_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
            		
            // InternalJavaSFT.g:831:3: ( (lv_varName_1_0= RULE_ID ) )
            // InternalJavaSFT.g:832:4: (lv_varName_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:832:4: (lv_varName_1_0= RULE_ID )
            // InternalJavaSFT.g:833:5: lv_varName_1_0= RULE_ID
            {
            lv_varName_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_varName_1_0, grammarAccess.getReturnAccess().getVarNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReturnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleConstant"
    // InternalJavaSFT.g:853:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalJavaSFT.g:853:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalJavaSFT.g:854:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalJavaSFT.g:860:1: ruleConstant returns [EObject current=null] : ( ( (lv_constDeclaration_0_0= ruleConstantDeclaration ) ) otherlv_1= '=' ( (lv_constAssignment_2_0= ruleConstantAssignment ) ) otherlv_3= ';' ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_constDeclaration_0_0 = null;

        EObject lv_constAssignment_2_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:866:2: ( ( ( (lv_constDeclaration_0_0= ruleConstantDeclaration ) ) otherlv_1= '=' ( (lv_constAssignment_2_0= ruleConstantAssignment ) ) otherlv_3= ';' ) )
            // InternalJavaSFT.g:867:2: ( ( (lv_constDeclaration_0_0= ruleConstantDeclaration ) ) otherlv_1= '=' ( (lv_constAssignment_2_0= ruleConstantAssignment ) ) otherlv_3= ';' )
            {
            // InternalJavaSFT.g:867:2: ( ( (lv_constDeclaration_0_0= ruleConstantDeclaration ) ) otherlv_1= '=' ( (lv_constAssignment_2_0= ruleConstantAssignment ) ) otherlv_3= ';' )
            // InternalJavaSFT.g:868:3: ( (lv_constDeclaration_0_0= ruleConstantDeclaration ) ) otherlv_1= '=' ( (lv_constAssignment_2_0= ruleConstantAssignment ) ) otherlv_3= ';'
            {
            // InternalJavaSFT.g:868:3: ( (lv_constDeclaration_0_0= ruleConstantDeclaration ) )
            // InternalJavaSFT.g:869:4: (lv_constDeclaration_0_0= ruleConstantDeclaration )
            {
            // InternalJavaSFT.g:869:4: (lv_constDeclaration_0_0= ruleConstantDeclaration )
            // InternalJavaSFT.g:870:5: lv_constDeclaration_0_0= ruleConstantDeclaration
            {

            					newCompositeNode(grammarAccess.getConstantAccess().getConstDeclarationConstantDeclarationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_constDeclaration_0_0=ruleConstantDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstantRule());
            					}
            					set(
            						current,
            						"constDeclaration",
            						lv_constDeclaration_0_0,
            						"projetIDM.JavaSFT.ConstantDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantAccess().getEqualsSignKeyword_1());
            		
            // InternalJavaSFT.g:891:3: ( (lv_constAssignment_2_0= ruleConstantAssignment ) )
            // InternalJavaSFT.g:892:4: (lv_constAssignment_2_0= ruleConstantAssignment )
            {
            // InternalJavaSFT.g:892:4: (lv_constAssignment_2_0= ruleConstantAssignment )
            // InternalJavaSFT.g:893:5: lv_constAssignment_2_0= ruleConstantAssignment
            {

            					newCompositeNode(grammarAccess.getConstantAccess().getConstAssignmentConstantAssignmentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
            lv_constAssignment_2_0=ruleConstantAssignment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstantRule());
            					}
            					set(
            						current,
            						"constAssignment",
            						lv_constAssignment_2_0,
            						"projetIDM.JavaSFT.ConstantAssignment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConstantAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleConstantDeclaration"
    // InternalJavaSFT.g:918:1: entryRuleConstantDeclaration returns [EObject current=null] : iv_ruleConstantDeclaration= ruleConstantDeclaration EOF ;
    public final EObject entryRuleConstantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDeclaration = null;


        try {
            // InternalJavaSFT.g:918:60: (iv_ruleConstantDeclaration= ruleConstantDeclaration EOF )
            // InternalJavaSFT.g:919:2: iv_ruleConstantDeclaration= ruleConstantDeclaration EOF
            {
             newCompositeNode(grammarAccess.getConstantDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantDeclaration=ruleConstantDeclaration();

            state._fsp--;

             current =iv_ruleConstantDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantDeclaration"


    // $ANTLR start "ruleConstantDeclaration"
    // InternalJavaSFT.g:925:1: ruleConstantDeclaration returns [EObject current=null] : (otherlv_0= 'final' ( (lv_type_1_0= ruleType ) ) ( (lv_varName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleConstantDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varName_2_0=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:931:2: ( (otherlv_0= 'final' ( (lv_type_1_0= ruleType ) ) ( (lv_varName_2_0= RULE_ID ) ) ) )
            // InternalJavaSFT.g:932:2: (otherlv_0= 'final' ( (lv_type_1_0= ruleType ) ) ( (lv_varName_2_0= RULE_ID ) ) )
            {
            // InternalJavaSFT.g:932:2: (otherlv_0= 'final' ( (lv_type_1_0= ruleType ) ) ( (lv_varName_2_0= RULE_ID ) ) )
            // InternalJavaSFT.g:933:3: otherlv_0= 'final' ( (lv_type_1_0= ruleType ) ) ( (lv_varName_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getConstantDeclarationAccess().getFinalKeyword_0());
            		
            // InternalJavaSFT.g:937:3: ( (lv_type_1_0= ruleType ) )
            // InternalJavaSFT.g:938:4: (lv_type_1_0= ruleType )
            {
            // InternalJavaSFT.g:938:4: (lv_type_1_0= ruleType )
            // InternalJavaSFT.g:939:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getConstantDeclarationAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstantDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"projetIDM.JavaSFT.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:956:3: ( (lv_varName_2_0= RULE_ID ) )
            // InternalJavaSFT.g:957:4: (lv_varName_2_0= RULE_ID )
            {
            // InternalJavaSFT.g:957:4: (lv_varName_2_0= RULE_ID )
            // InternalJavaSFT.g:958:5: lv_varName_2_0= RULE_ID
            {
            lv_varName_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_varName_2_0, grammarAccess.getConstantDeclarationAccess().getVarNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstantDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varName",
            						lv_varName_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantDeclaration"


    // $ANTLR start "entryRuleConstantAssignment"
    // InternalJavaSFT.g:978:1: entryRuleConstantAssignment returns [EObject current=null] : iv_ruleConstantAssignment= ruleConstantAssignment EOF ;
    public final EObject entryRuleConstantAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantAssignment = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalJavaSFT.g:980:2: (iv_ruleConstantAssignment= ruleConstantAssignment EOF )
            // InternalJavaSFT.g:981:2: iv_ruleConstantAssignment= ruleConstantAssignment EOF
            {
             newCompositeNode(grammarAccess.getConstantAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantAssignment=ruleConstantAssignment();

            state._fsp--;

             current =iv_ruleConstantAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleConstantAssignment"


    // $ANTLR start "ruleConstantAssignment"
    // InternalJavaSFT.g:990:1: ruleConstantAssignment returns [EObject current=null] : ( ruleType otherlv_1= '.valueOf(' ( (lv_value_2_0= ruleValue ) ) otherlv_3= ')' ) ;
    public final EObject ruleConstantAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // InternalJavaSFT.g:997:2: ( ( ruleType otherlv_1= '.valueOf(' ( (lv_value_2_0= ruleValue ) ) otherlv_3= ')' ) )
            // InternalJavaSFT.g:998:2: ( ruleType otherlv_1= '.valueOf(' ( (lv_value_2_0= ruleValue ) ) otherlv_3= ')' )
            {
            // InternalJavaSFT.g:998:2: ( ruleType otherlv_1= '.valueOf(' ( (lv_value_2_0= ruleValue ) ) otherlv_3= ')' )
            // InternalJavaSFT.g:999:3: ruleType otherlv_1= '.valueOf(' ( (lv_value_2_0= ruleValue ) ) otherlv_3= ')'
            {

            			newCompositeNode(grammarAccess.getConstantAssignmentAccess().getTypeParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            ruleType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,41,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getConstantAssignmentAccess().getValueOfKeyword_1());
            		
            // InternalJavaSFT.g:1010:3: ( (lv_value_2_0= ruleValue ) )
            // InternalJavaSFT.g:1011:4: (lv_value_2_0= ruleValue )
            {
            // InternalJavaSFT.g:1011:4: (lv_value_2_0= ruleValue )
            // InternalJavaSFT.g:1012:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getConstantAssignmentAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstantAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"projetIDM.JavaSFT.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConstantAssignmentAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleConstantAssignment"


    // $ANTLR start "entryRuleOperation"
    // InternalJavaSFT.g:1040:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalJavaSFT.g:1040:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalJavaSFT.g:1041:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalJavaSFT.g:1047:1: ruleOperation returns [EObject current=null] : (this_OperationUnaire_0= ruleOperationUnaire | this_OperationBinaire_1= ruleOperationBinaire ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_OperationUnaire_0 = null;

        EObject this_OperationBinaire_1 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:1053:2: ( (this_OperationUnaire_0= ruleOperationUnaire | this_OperationBinaire_1= ruleOperationBinaire ) )
            // InternalJavaSFT.g:1054:2: (this_OperationUnaire_0= ruleOperationUnaire | this_OperationBinaire_1= ruleOperationBinaire )
            {
            // InternalJavaSFT.g:1054:2: (this_OperationUnaire_0= ruleOperationUnaire | this_OperationBinaire_1= ruleOperationBinaire )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalJavaSFT.g:1055:3: this_OperationUnaire_0= ruleOperationUnaire
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getOperationUnaireParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationUnaire_0=ruleOperationUnaire();

                    state._fsp--;


                    			current = this_OperationUnaire_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:1064:3: this_OperationBinaire_1= ruleOperationBinaire
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getOperationBinaireParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationBinaire_1=ruleOperationBinaire();

                    state._fsp--;


                    			current = this_OperationBinaire_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleOperationUnaire"
    // InternalJavaSFT.g:1076:1: entryRuleOperationUnaire returns [EObject current=null] : iv_ruleOperationUnaire= ruleOperationUnaire EOF ;
    public final EObject entryRuleOperationUnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationUnaire = null;


        try {
            // InternalJavaSFT.g:1076:56: (iv_ruleOperationUnaire= ruleOperationUnaire EOF )
            // InternalJavaSFT.g:1077:2: iv_ruleOperationUnaire= ruleOperationUnaire EOF
            {
             newCompositeNode(grammarAccess.getOperationUnaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationUnaire=ruleOperationUnaire();

            state._fsp--;

             current =iv_ruleOperationUnaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationUnaire"


    // $ANTLR start "ruleOperationUnaire"
    // InternalJavaSFT.g:1083:1: ruleOperationUnaire returns [EObject current=null] : (this_SumUnaire_0= ruleSumUnaire | this_ProductUnaire_1= ruleProductUnaire | this_MinUnaire_2= ruleMinUnaire | this_MaxUnaire_3= ruleMaxUnaire | this_OppositeUnaire_4= ruleOppositeUnaire | this_CosUnaire_5= ruleCosUnaire | this_SinUnaire_6= ruleSinUnaire | this_SqrtUnaire_7= ruleSqrtUnaire | this_ExpUnaire_8= ruleExpUnaire ) ;
    public final EObject ruleOperationUnaire() throws RecognitionException {
        EObject current = null;

        EObject this_SumUnaire_0 = null;

        EObject this_ProductUnaire_1 = null;

        EObject this_MinUnaire_2 = null;

        EObject this_MaxUnaire_3 = null;

        EObject this_OppositeUnaire_4 = null;

        EObject this_CosUnaire_5 = null;

        EObject this_SinUnaire_6 = null;

        EObject this_SqrtUnaire_7 = null;

        EObject this_ExpUnaire_8 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:1089:2: ( (this_SumUnaire_0= ruleSumUnaire | this_ProductUnaire_1= ruleProductUnaire | this_MinUnaire_2= ruleMinUnaire | this_MaxUnaire_3= ruleMaxUnaire | this_OppositeUnaire_4= ruleOppositeUnaire | this_CosUnaire_5= ruleCosUnaire | this_SinUnaire_6= ruleSinUnaire | this_SqrtUnaire_7= ruleSqrtUnaire | this_ExpUnaire_8= ruleExpUnaire ) )
            // InternalJavaSFT.g:1090:2: (this_SumUnaire_0= ruleSumUnaire | this_ProductUnaire_1= ruleProductUnaire | this_MinUnaire_2= ruleMinUnaire | this_MaxUnaire_3= ruleMaxUnaire | this_OppositeUnaire_4= ruleOppositeUnaire | this_CosUnaire_5= ruleCosUnaire | this_SinUnaire_6= ruleSinUnaire | this_SqrtUnaire_7= ruleSqrtUnaire | this_ExpUnaire_8= ruleExpUnaire )
            {
            // InternalJavaSFT.g:1090:2: (this_SumUnaire_0= ruleSumUnaire | this_ProductUnaire_1= ruleProductUnaire | this_MinUnaire_2= ruleMinUnaire | this_MaxUnaire_3= ruleMaxUnaire | this_OppositeUnaire_4= ruleOppositeUnaire | this_CosUnaire_5= ruleCosUnaire | this_SinUnaire_6= ruleSinUnaire | this_SqrtUnaire_7= ruleSqrtUnaire | this_ExpUnaire_8= ruleExpUnaire )
            int alt9=9;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalJavaSFT.g:1091:3: this_SumUnaire_0= ruleSumUnaire
                    {

                    			newCompositeNode(grammarAccess.getOperationUnaireAccess().getSumUnaireParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SumUnaire_0=ruleSumUnaire();

                    state._fsp--;


                    			current = this_SumUnaire_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:1100:3: this_ProductUnaire_1= ruleProductUnaire
                    {

                    			newCompositeNode(grammarAccess.getOperationUnaireAccess().getProductUnaireParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProductUnaire_1=ruleProductUnaire();

                    state._fsp--;


                    			current = this_ProductUnaire_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJavaSFT.g:1109:3: this_MinUnaire_2= ruleMinUnaire
                    {

                    			newCompositeNode(grammarAccess.getOperationUnaireAccess().getMinUnaireParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinUnaire_2=ruleMinUnaire();

                    state._fsp--;


                    			current = this_MinUnaire_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJavaSFT.g:1118:3: this_MaxUnaire_3= ruleMaxUnaire
                    {

                    			newCompositeNode(grammarAccess.getOperationUnaireAccess().getMaxUnaireParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxUnaire_3=ruleMaxUnaire();

                    state._fsp--;


                    			current = this_MaxUnaire_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJavaSFT.g:1127:3: this_OppositeUnaire_4= ruleOppositeUnaire
                    {

                    			newCompositeNode(grammarAccess.getOperationUnaireAccess().getOppositeUnaireParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_OppositeUnaire_4=ruleOppositeUnaire();

                    state._fsp--;


                    			current = this_OppositeUnaire_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJavaSFT.g:1136:3: this_CosUnaire_5= ruleCosUnaire
                    {

                    			newCompositeNode(grammarAccess.getOperationUnaireAccess().getCosUnaireParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CosUnaire_5=ruleCosUnaire();

                    state._fsp--;


                    			current = this_CosUnaire_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalJavaSFT.g:1145:3: this_SinUnaire_6= ruleSinUnaire
                    {

                    			newCompositeNode(grammarAccess.getOperationUnaireAccess().getSinUnaireParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SinUnaire_6=ruleSinUnaire();

                    state._fsp--;


                    			current = this_SinUnaire_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalJavaSFT.g:1154:3: this_SqrtUnaire_7= ruleSqrtUnaire
                    {

                    			newCompositeNode(grammarAccess.getOperationUnaireAccess().getSqrtUnaireParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_SqrtUnaire_7=ruleSqrtUnaire();

                    state._fsp--;


                    			current = this_SqrtUnaire_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalJavaSFT.g:1163:3: this_ExpUnaire_8= ruleExpUnaire
                    {

                    			newCompositeNode(grammarAccess.getOperationUnaireAccess().getExpUnaireParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpUnaire_8=ruleExpUnaire();

                    state._fsp--;


                    			current = this_ExpUnaire_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationUnaire"


    // $ANTLR start "entryRuleOperationBinaire"
    // InternalJavaSFT.g:1175:1: entryRuleOperationBinaire returns [EObject current=null] : iv_ruleOperationBinaire= ruleOperationBinaire EOF ;
    public final EObject entryRuleOperationBinaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationBinaire = null;


        try {
            // InternalJavaSFT.g:1175:57: (iv_ruleOperationBinaire= ruleOperationBinaire EOF )
            // InternalJavaSFT.g:1176:2: iv_ruleOperationBinaire= ruleOperationBinaire EOF
            {
             newCompositeNode(grammarAccess.getOperationBinaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationBinaire=ruleOperationBinaire();

            state._fsp--;

             current =iv_ruleOperationBinaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperationBinaire"


    // $ANTLR start "ruleOperationBinaire"
    // InternalJavaSFT.g:1182:1: ruleOperationBinaire returns [EObject current=null] : (this_SumBinaire_0= ruleSumBinaire | this_ProductBinaire_1= ruleProductBinaire | this_DivisionBinaire_2= ruleDivisionBinaire | this_MinBinaire_3= ruleMinBinaire | this_MaxBinaire_4= ruleMaxBinaire ) ;
    public final EObject ruleOperationBinaire() throws RecognitionException {
        EObject current = null;

        EObject this_SumBinaire_0 = null;

        EObject this_ProductBinaire_1 = null;

        EObject this_DivisionBinaire_2 = null;

        EObject this_MinBinaire_3 = null;

        EObject this_MaxBinaire_4 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:1188:2: ( (this_SumBinaire_0= ruleSumBinaire | this_ProductBinaire_1= ruleProductBinaire | this_DivisionBinaire_2= ruleDivisionBinaire | this_MinBinaire_3= ruleMinBinaire | this_MaxBinaire_4= ruleMaxBinaire ) )
            // InternalJavaSFT.g:1189:2: (this_SumBinaire_0= ruleSumBinaire | this_ProductBinaire_1= ruleProductBinaire | this_DivisionBinaire_2= ruleDivisionBinaire | this_MinBinaire_3= ruleMinBinaire | this_MaxBinaire_4= ruleMaxBinaire )
            {
            // InternalJavaSFT.g:1189:2: (this_SumBinaire_0= ruleSumBinaire | this_ProductBinaire_1= ruleProductBinaire | this_DivisionBinaire_2= ruleDivisionBinaire | this_MinBinaire_3= ruleMinBinaire | this_MaxBinaire_4= ruleMaxBinaire )
            int alt10=5;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalJavaSFT.g:1190:3: this_SumBinaire_0= ruleSumBinaire
                    {

                    			newCompositeNode(grammarAccess.getOperationBinaireAccess().getSumBinaireParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SumBinaire_0=ruleSumBinaire();

                    state._fsp--;


                    			current = this_SumBinaire_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:1199:3: this_ProductBinaire_1= ruleProductBinaire
                    {

                    			newCompositeNode(grammarAccess.getOperationBinaireAccess().getProductBinaireParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProductBinaire_1=ruleProductBinaire();

                    state._fsp--;


                    			current = this_ProductBinaire_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJavaSFT.g:1208:3: this_DivisionBinaire_2= ruleDivisionBinaire
                    {

                    			newCompositeNode(grammarAccess.getOperationBinaireAccess().getDivisionBinaireParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DivisionBinaire_2=ruleDivisionBinaire();

                    state._fsp--;


                    			current = this_DivisionBinaire_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJavaSFT.g:1217:3: this_MinBinaire_3= ruleMinBinaire
                    {

                    			newCompositeNode(grammarAccess.getOperationBinaireAccess().getMinBinaireParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinBinaire_3=ruleMinBinaire();

                    state._fsp--;


                    			current = this_MinBinaire_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJavaSFT.g:1226:3: this_MaxBinaire_4= ruleMaxBinaire
                    {

                    			newCompositeNode(grammarAccess.getOperationBinaireAccess().getMaxBinaireParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxBinaire_4=ruleMaxBinaire();

                    state._fsp--;


                    			current = this_MaxBinaire_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperationBinaire"


    // $ANTLR start "entryRuleSumUnaire"
    // InternalJavaSFT.g:1238:1: entryRuleSumUnaire returns [EObject current=null] : iv_ruleSumUnaire= ruleSumUnaire EOF ;
    public final EObject entryRuleSumUnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumUnaire = null;


        try {
            // InternalJavaSFT.g:1238:50: (iv_ruleSumUnaire= ruleSumUnaire EOF )
            // InternalJavaSFT.g:1239:2: iv_ruleSumUnaire= ruleSumUnaire EOF
            {
             newCompositeNode(grammarAccess.getSumUnaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSumUnaire=ruleSumUnaire();

            state._fsp--;

             current =iv_ruleSumUnaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumUnaire"


    // $ANTLR start "ruleSumUnaire"
    // InternalJavaSFT.g:1245:1: ruleSumUnaire returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_listNameRight_3_0= RULE_ID ) ) otherlv_4= '.stream().reduce((s,e)->s+e).get();' ) ;
    public final EObject ruleSumUnaire() throws RecognitionException {
        EObject current = null;

        Token lv_varNameLeft_1_0=null;
        Token otherlv_2=null;
        Token lv_listNameRight_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:1251:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_listNameRight_3_0= RULE_ID ) ) otherlv_4= '.stream().reduce((s,e)->s+e).get();' ) )
            // InternalJavaSFT.g:1252:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_listNameRight_3_0= RULE_ID ) ) otherlv_4= '.stream().reduce((s,e)->s+e).get();' )
            {
            // InternalJavaSFT.g:1252:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_listNameRight_3_0= RULE_ID ) ) otherlv_4= '.stream().reduce((s,e)->s+e).get();' )
            // InternalJavaSFT.g:1253:3: ( (lv_type_0_0= ruleType ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_listNameRight_3_0= RULE_ID ) ) otherlv_4= '.stream().reduce((s,e)->s+e).get();'
            {
            // InternalJavaSFT.g:1253:3: ( (lv_type_0_0= ruleType ) )
            // InternalJavaSFT.g:1254:4: (lv_type_0_0= ruleType )
            {
            // InternalJavaSFT.g:1254:4: (lv_type_0_0= ruleType )
            // InternalJavaSFT.g:1255:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSumUnaireAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumUnaireRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"projetIDM.JavaSFT.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:1272:3: ( (lv_varNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:1273:4: (lv_varNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:1273:4: (lv_varNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:1274:5: lv_varNameLeft_1_0= RULE_ID
            {
            lv_varNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_varNameLeft_1_0, grammarAccess.getSumUnaireAccess().getVarNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSumUnaireRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameLeft",
            						lv_varNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSumUnaireAccess().getEqualsSignKeyword_2());
            		
            // InternalJavaSFT.g:1294:3: ( (lv_listNameRight_3_0= RULE_ID ) )
            // InternalJavaSFT.g:1295:4: (lv_listNameRight_3_0= RULE_ID )
            {
            // InternalJavaSFT.g:1295:4: (lv_listNameRight_3_0= RULE_ID )
            // InternalJavaSFT.g:1296:5: lv_listNameRight_3_0= RULE_ID
            {
            lv_listNameRight_3_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(lv_listNameRight_3_0, grammarAccess.getSumUnaireAccess().getListNameRightIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSumUnaireRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,42,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSumUnaireAccess().getStreamReduceSESEGetKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumUnaire"


    // $ANTLR start "entryRuleProductUnaire"
    // InternalJavaSFT.g:1320:1: entryRuleProductUnaire returns [EObject current=null] : iv_ruleProductUnaire= ruleProductUnaire EOF ;
    public final EObject entryRuleProductUnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductUnaire = null;


        try {
            // InternalJavaSFT.g:1320:54: (iv_ruleProductUnaire= ruleProductUnaire EOF )
            // InternalJavaSFT.g:1321:2: iv_ruleProductUnaire= ruleProductUnaire EOF
            {
             newCompositeNode(grammarAccess.getProductUnaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductUnaire=ruleProductUnaire();

            state._fsp--;

             current =iv_ruleProductUnaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductUnaire"


    // $ANTLR start "ruleProductUnaire"
    // InternalJavaSFT.g:1327:1: ruleProductUnaire returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_listNameRight_3_0= RULE_ID ) ) otherlv_4= '.stream().reduce((s,e)->s*e).get();' ) ;
    public final EObject ruleProductUnaire() throws RecognitionException {
        EObject current = null;

        Token lv_varNameLeft_1_0=null;
        Token otherlv_2=null;
        Token lv_listNameRight_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:1333:2: ( ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_listNameRight_3_0= RULE_ID ) ) otherlv_4= '.stream().reduce((s,e)->s*e).get();' ) )
            // InternalJavaSFT.g:1334:2: ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_listNameRight_3_0= RULE_ID ) ) otherlv_4= '.stream().reduce((s,e)->s*e).get();' )
            {
            // InternalJavaSFT.g:1334:2: ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_listNameRight_3_0= RULE_ID ) ) otherlv_4= '.stream().reduce((s,e)->s*e).get();' )
            // InternalJavaSFT.g:1335:3: ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_listNameRight_3_0= RULE_ID ) ) otherlv_4= '.stream().reduce((s,e)->s*e).get();'
            {
            // InternalJavaSFT.g:1335:3: ( (lv_type_0_0= ruleTypeNumber ) )
            // InternalJavaSFT.g:1336:4: (lv_type_0_0= ruleTypeNumber )
            {
            // InternalJavaSFT.g:1336:4: (lv_type_0_0= ruleTypeNumber )
            // InternalJavaSFT.g:1337:5: lv_type_0_0= ruleTypeNumber
            {

            					newCompositeNode(grammarAccess.getProductUnaireAccess().getTypeTypeNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_0_0=ruleTypeNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductUnaireRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"projetIDM.JavaSFT.TypeNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:1354:3: ( (lv_varNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:1355:4: (lv_varNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:1355:4: (lv_varNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:1356:5: lv_varNameLeft_1_0= RULE_ID
            {
            lv_varNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_varNameLeft_1_0, grammarAccess.getProductUnaireAccess().getVarNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductUnaireRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameLeft",
            						lv_varNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getProductUnaireAccess().getEqualsSignKeyword_2());
            		
            // InternalJavaSFT.g:1376:3: ( (lv_listNameRight_3_0= RULE_ID ) )
            // InternalJavaSFT.g:1377:4: (lv_listNameRight_3_0= RULE_ID )
            {
            // InternalJavaSFT.g:1377:4: (lv_listNameRight_3_0= RULE_ID )
            // InternalJavaSFT.g:1378:5: lv_listNameRight_3_0= RULE_ID
            {
            lv_listNameRight_3_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(lv_listNameRight_3_0, grammarAccess.getProductUnaireAccess().getListNameRightIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductUnaireRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProductUnaireAccess().getStreamReduceSESEGetKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductUnaire"


    // $ANTLR start "entryRuleMinUnaire"
    // InternalJavaSFT.g:1402:1: entryRuleMinUnaire returns [EObject current=null] : iv_ruleMinUnaire= ruleMinUnaire EOF ;
    public final EObject entryRuleMinUnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinUnaire = null;


        try {
            // InternalJavaSFT.g:1402:50: (iv_ruleMinUnaire= ruleMinUnaire EOF )
            // InternalJavaSFT.g:1403:2: iv_ruleMinUnaire= ruleMinUnaire EOF
            {
             newCompositeNode(grammarAccess.getMinUnaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinUnaire=ruleMinUnaire();

            state._fsp--;

             current =iv_ruleMinUnaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinUnaire"


    // $ANTLR start "ruleMinUnaire"
    // InternalJavaSFT.g:1409:1: ruleMinUnaire returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Collections.min(' ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleMinUnaire() throws RecognitionException {
        EObject current = null;

        Token lv_varNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_listNameRight_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:1415:2: ( ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Collections.min(' ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalJavaSFT.g:1416:2: ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Collections.min(' ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalJavaSFT.g:1416:2: ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Collections.min(' ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= ')' )
            // InternalJavaSFT.g:1417:3: ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Collections.min(' ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= ')'
            {
            // InternalJavaSFT.g:1417:3: ( (lv_type_0_0= ruleTypeNumber ) )
            // InternalJavaSFT.g:1418:4: (lv_type_0_0= ruleTypeNumber )
            {
            // InternalJavaSFT.g:1418:4: (lv_type_0_0= ruleTypeNumber )
            // InternalJavaSFT.g:1419:5: lv_type_0_0= ruleTypeNumber
            {

            					newCompositeNode(grammarAccess.getMinUnaireAccess().getTypeTypeNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_0_0=ruleTypeNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinUnaireRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"projetIDM.JavaSFT.TypeNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:1436:3: ( (lv_varNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:1437:4: (lv_varNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:1437:4: (lv_varNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:1438:5: lv_varNameLeft_1_0= RULE_ID
            {
            lv_varNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_varNameLeft_1_0, grammarAccess.getMinUnaireAccess().getVarNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinUnaireRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameLeft",
            						lv_varNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getMinUnaireAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,44,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getMinUnaireAccess().getCollectionsMinKeyword_3());
            		
            // InternalJavaSFT.g:1462:3: ( (lv_listNameRight_4_0= RULE_ID ) )
            // InternalJavaSFT.g:1463:4: (lv_listNameRight_4_0= RULE_ID )
            {
            // InternalJavaSFT.g:1463:4: (lv_listNameRight_4_0= RULE_ID )
            // InternalJavaSFT.g:1464:5: lv_listNameRight_4_0= RULE_ID
            {
            lv_listNameRight_4_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_listNameRight_4_0, grammarAccess.getMinUnaireAccess().getListNameRightIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinUnaireRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMinUnaireAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinUnaire"


    // $ANTLR start "entryRuleMaxUnaire"
    // InternalJavaSFT.g:1488:1: entryRuleMaxUnaire returns [EObject current=null] : iv_ruleMaxUnaire= ruleMaxUnaire EOF ;
    public final EObject entryRuleMaxUnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxUnaire = null;


        try {
            // InternalJavaSFT.g:1488:50: (iv_ruleMaxUnaire= ruleMaxUnaire EOF )
            // InternalJavaSFT.g:1489:2: iv_ruleMaxUnaire= ruleMaxUnaire EOF
            {
             newCompositeNode(grammarAccess.getMaxUnaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxUnaire=ruleMaxUnaire();

            state._fsp--;

             current =iv_ruleMaxUnaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxUnaire"


    // $ANTLR start "ruleMaxUnaire"
    // InternalJavaSFT.g:1495:1: ruleMaxUnaire returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Collections.max(' ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleMaxUnaire() throws RecognitionException {
        EObject current = null;

        Token lv_varNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_listNameRight_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:1501:2: ( ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Collections.max(' ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalJavaSFT.g:1502:2: ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Collections.max(' ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalJavaSFT.g:1502:2: ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Collections.max(' ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= ')' )
            // InternalJavaSFT.g:1503:3: ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Collections.max(' ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= ')'
            {
            // InternalJavaSFT.g:1503:3: ( (lv_type_0_0= ruleTypeNumber ) )
            // InternalJavaSFT.g:1504:4: (lv_type_0_0= ruleTypeNumber )
            {
            // InternalJavaSFT.g:1504:4: (lv_type_0_0= ruleTypeNumber )
            // InternalJavaSFT.g:1505:5: lv_type_0_0= ruleTypeNumber
            {

            					newCompositeNode(grammarAccess.getMaxUnaireAccess().getTypeTypeNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_0_0=ruleTypeNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxUnaireRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"projetIDM.JavaSFT.TypeNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:1522:3: ( (lv_varNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:1523:4: (lv_varNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:1523:4: (lv_varNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:1524:5: lv_varNameLeft_1_0= RULE_ID
            {
            lv_varNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_varNameLeft_1_0, grammarAccess.getMaxUnaireAccess().getVarNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxUnaireRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameLeft",
            						lv_varNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getMaxUnaireAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getMaxUnaireAccess().getCollectionsMaxKeyword_3());
            		
            // InternalJavaSFT.g:1548:3: ( (lv_listNameRight_4_0= RULE_ID ) )
            // InternalJavaSFT.g:1549:4: (lv_listNameRight_4_0= RULE_ID )
            {
            // InternalJavaSFT.g:1549:4: (lv_listNameRight_4_0= RULE_ID )
            // InternalJavaSFT.g:1550:5: lv_listNameRight_4_0= RULE_ID
            {
            lv_listNameRight_4_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_listNameRight_4_0, grammarAccess.getMaxUnaireAccess().getListNameRightIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxUnaireRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMaxUnaireAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxUnaire"


    // $ANTLR start "entryRuleOppositeUnaire"
    // InternalJavaSFT.g:1574:1: entryRuleOppositeUnaire returns [EObject current=null] : iv_ruleOppositeUnaire= ruleOppositeUnaire EOF ;
    public final EObject entryRuleOppositeUnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOppositeUnaire = null;


        try {
            // InternalJavaSFT.g:1574:55: (iv_ruleOppositeUnaire= ruleOppositeUnaire EOF )
            // InternalJavaSFT.g:1575:2: iv_ruleOppositeUnaire= ruleOppositeUnaire EOF
            {
             newCompositeNode(grammarAccess.getOppositeUnaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOppositeUnaire=ruleOppositeUnaire();

            state._fsp--;

             current =iv_ruleOppositeUnaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOppositeUnaire"


    // $ANTLR start "ruleOppositeUnaire"
    // InternalJavaSFT.g:1581:1: ruleOppositeUnaire returns [EObject current=null] : (this_OppositeUnaireList_0= ruleOppositeUnaireList | this_OppositeUnaireNumber_1= ruleOppositeUnaireNumber ) ;
    public final EObject ruleOppositeUnaire() throws RecognitionException {
        EObject current = null;

        EObject this_OppositeUnaireList_0 = null;

        EObject this_OppositeUnaireNumber_1 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:1587:2: ( (this_OppositeUnaireList_0= ruleOppositeUnaireList | this_OppositeUnaireNumber_1= ruleOppositeUnaireNumber ) )
            // InternalJavaSFT.g:1588:2: (this_OppositeUnaireList_0= ruleOppositeUnaireList | this_OppositeUnaireNumber_1= ruleOppositeUnaireNumber )
            {
            // InternalJavaSFT.g:1588:2: (this_OppositeUnaireList_0= ruleOppositeUnaireList | this_OppositeUnaireNumber_1= ruleOppositeUnaireNumber )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_TYPE_INTEGER && LA11_0<=RULE_TYPE_FLOAT)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalJavaSFT.g:1589:3: this_OppositeUnaireList_0= ruleOppositeUnaireList
                    {

                    			newCompositeNode(grammarAccess.getOppositeUnaireAccess().getOppositeUnaireListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_OppositeUnaireList_0=ruleOppositeUnaireList();

                    state._fsp--;


                    			current = this_OppositeUnaireList_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:1598:3: this_OppositeUnaireNumber_1= ruleOppositeUnaireNumber
                    {

                    			newCompositeNode(grammarAccess.getOppositeUnaireAccess().getOppositeUnaireNumberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OppositeUnaireNumber_1=ruleOppositeUnaireNumber();

                    state._fsp--;


                    			current = this_OppositeUnaireNumber_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOppositeUnaire"


    // $ANTLR start "entryRuleOppositeUnaireList"
    // InternalJavaSFT.g:1610:1: entryRuleOppositeUnaireList returns [EObject current=null] : iv_ruleOppositeUnaireList= ruleOppositeUnaireList EOF ;
    public final EObject entryRuleOppositeUnaireList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOppositeUnaireList = null;


        try {
            // InternalJavaSFT.g:1610:59: (iv_ruleOppositeUnaireList= ruleOppositeUnaireList EOF )
            // InternalJavaSFT.g:1611:2: iv_ruleOppositeUnaireList= ruleOppositeUnaireList EOF
            {
             newCompositeNode(grammarAccess.getOppositeUnaireListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOppositeUnaireList=ruleOppositeUnaireList();

            state._fsp--;

             current =iv_ruleOppositeUnaireList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOppositeUnaireList"


    // $ANTLR start "ruleOppositeUnaireList"
    // InternalJavaSFT.g:1617:1: ruleOppositeUnaireList returns [EObject current=null] : ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->-e).collect(Collectors.toList());' ) ;
    public final EObject ruleOppositeUnaireList() throws RecognitionException {
        EObject current = null;

        Token lv_listNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_listNameRight_6_0=null;
        Token otherlv_7=null;
        EObject lv_typeListLeft_0_0 = null;

        EObject lv_typeListRight_4_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:1623:2: ( ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->-e).collect(Collectors.toList());' ) )
            // InternalJavaSFT.g:1624:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->-e).collect(Collectors.toList());' )
            {
            // InternalJavaSFT.g:1624:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->-e).collect(Collectors.toList());' )
            // InternalJavaSFT.g:1625:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->-e).collect(Collectors.toList());'
            {
            // InternalJavaSFT.g:1625:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:1626:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:1626:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            // InternalJavaSFT.g:1627:5: lv_typeListLeft_0_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getOppositeUnaireListAccess().getTypeListLeftTypeListNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListLeft_0_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOppositeUnaireListRule());
            					}
            					set(
            						current,
            						"typeListLeft",
            						lv_typeListLeft_0_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:1644:3: ( (lv_listNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:1645:4: (lv_listNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:1645:4: (lv_listNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:1646:5: lv_listNameLeft_1_0= RULE_ID
            {
            lv_listNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_listNameLeft_1_0, grammarAccess.getOppositeUnaireListAccess().getListNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOppositeUnaireListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameLeft",
            						lv_listNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getOppositeUnaireListAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getOppositeUnaireListAccess().getLeftParenthesisKeyword_3());
            		
            // InternalJavaSFT.g:1670:3: ( (lv_typeListRight_4_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:1671:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:1671:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            // InternalJavaSFT.g:1672:5: lv_typeListRight_4_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getOppositeUnaireListAccess().getTypeListRightTypeListNumberParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_typeListRight_4_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOppositeUnaireListRule());
            					}
            					set(
            						current,
            						"typeListRight",
            						lv_typeListRight_4_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getOppositeUnaireListAccess().getRightParenthesisKeyword_5());
            		
            // InternalJavaSFT.g:1693:3: ( (lv_listNameRight_6_0= RULE_ID ) )
            // InternalJavaSFT.g:1694:4: (lv_listNameRight_6_0= RULE_ID )
            {
            // InternalJavaSFT.g:1694:4: (lv_listNameRight_6_0= RULE_ID )
            // InternalJavaSFT.g:1695:5: lv_listNameRight_6_0= RULE_ID
            {
            lv_listNameRight_6_0=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(lv_listNameRight_6_0, grammarAccess.getOppositeUnaireListAccess().getListNameRightIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOppositeUnaireListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getOppositeUnaireListAccess().getStreamMapEECollectCollectorsToListKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOppositeUnaireList"


    // $ANTLR start "entryRuleOppositeUnaireNumber"
    // InternalJavaSFT.g:1719:1: entryRuleOppositeUnaireNumber returns [EObject current=null] : iv_ruleOppositeUnaireNumber= ruleOppositeUnaireNumber EOF ;
    public final EObject entryRuleOppositeUnaireNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOppositeUnaireNumber = null;


        try {
            // InternalJavaSFT.g:1719:61: (iv_ruleOppositeUnaireNumber= ruleOppositeUnaireNumber EOF )
            // InternalJavaSFT.g:1720:2: iv_ruleOppositeUnaireNumber= ruleOppositeUnaireNumber EOF
            {
             newCompositeNode(grammarAccess.getOppositeUnaireNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOppositeUnaireNumber=ruleOppositeUnaireNumber();

            state._fsp--;

             current =iv_ruleOppositeUnaireNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOppositeUnaireNumber"


    // $ANTLR start "ruleOppositeUnaireNumber"
    // InternalJavaSFT.g:1726:1: ruleOppositeUnaireNumber returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '-' ( (lv_varNameRight_4_0= RULE_ID ) ) ) ;
    public final EObject ruleOppositeUnaireNumber() throws RecognitionException {
        EObject current = null;

        Token lv_varNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_varNameRight_4_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:1732:2: ( ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '-' ( (lv_varNameRight_4_0= RULE_ID ) ) ) )
            // InternalJavaSFT.g:1733:2: ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '-' ( (lv_varNameRight_4_0= RULE_ID ) ) )
            {
            // InternalJavaSFT.g:1733:2: ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '-' ( (lv_varNameRight_4_0= RULE_ID ) ) )
            // InternalJavaSFT.g:1734:3: ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '-' ( (lv_varNameRight_4_0= RULE_ID ) )
            {
            // InternalJavaSFT.g:1734:3: ( (lv_type_0_0= ruleTypeNumber ) )
            // InternalJavaSFT.g:1735:4: (lv_type_0_0= ruleTypeNumber )
            {
            // InternalJavaSFT.g:1735:4: (lv_type_0_0= ruleTypeNumber )
            // InternalJavaSFT.g:1736:5: lv_type_0_0= ruleTypeNumber
            {

            					newCompositeNode(grammarAccess.getOppositeUnaireNumberAccess().getTypeTypeNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_0_0=ruleTypeNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOppositeUnaireNumberRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"projetIDM.JavaSFT.TypeNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:1753:3: ( (lv_varNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:1754:4: (lv_varNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:1754:4: (lv_varNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:1755:5: lv_varNameLeft_1_0= RULE_ID
            {
            lv_varNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_varNameLeft_1_0, grammarAccess.getOppositeUnaireNumberAccess().getVarNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOppositeUnaireNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameLeft",
            						lv_varNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getOppositeUnaireNumberAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,48,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getOppositeUnaireNumberAccess().getHyphenMinusKeyword_3());
            		
            // InternalJavaSFT.g:1779:3: ( (lv_varNameRight_4_0= RULE_ID ) )
            // InternalJavaSFT.g:1780:4: (lv_varNameRight_4_0= RULE_ID )
            {
            // InternalJavaSFT.g:1780:4: (lv_varNameRight_4_0= RULE_ID )
            // InternalJavaSFT.g:1781:5: lv_varNameRight_4_0= RULE_ID
            {
            lv_varNameRight_4_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_varNameRight_4_0, grammarAccess.getOppositeUnaireNumberAccess().getVarNameRightIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOppositeUnaireNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameRight",
            						lv_varNameRight_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOppositeUnaireNumber"


    // $ANTLR start "entryRuleCosUnaire"
    // InternalJavaSFT.g:1801:1: entryRuleCosUnaire returns [EObject current=null] : iv_ruleCosUnaire= ruleCosUnaire EOF ;
    public final EObject entryRuleCosUnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCosUnaire = null;


        try {
            // InternalJavaSFT.g:1801:50: (iv_ruleCosUnaire= ruleCosUnaire EOF )
            // InternalJavaSFT.g:1802:2: iv_ruleCosUnaire= ruleCosUnaire EOF
            {
             newCompositeNode(grammarAccess.getCosUnaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCosUnaire=ruleCosUnaire();

            state._fsp--;

             current =iv_ruleCosUnaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCosUnaire"


    // $ANTLR start "ruleCosUnaire"
    // InternalJavaSFT.g:1808:1: ruleCosUnaire returns [EObject current=null] : (this_CosUnaireList_0= ruleCosUnaireList | this_CosUnaireNumber_1= ruleCosUnaireNumber ) ;
    public final EObject ruleCosUnaire() throws RecognitionException {
        EObject current = null;

        EObject this_CosUnaireList_0 = null;

        EObject this_CosUnaireNumber_1 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:1814:2: ( (this_CosUnaireList_0= ruleCosUnaireList | this_CosUnaireNumber_1= ruleCosUnaireNumber ) )
            // InternalJavaSFT.g:1815:2: (this_CosUnaireList_0= ruleCosUnaireList | this_CosUnaireNumber_1= ruleCosUnaireNumber )
            {
            // InternalJavaSFT.g:1815:2: (this_CosUnaireList_0= ruleCosUnaireList | this_CosUnaireNumber_1= ruleCosUnaireNumber )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=RULE_TYPE_INTEGER && LA12_0<=RULE_TYPE_FLOAT)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalJavaSFT.g:1816:3: this_CosUnaireList_0= ruleCosUnaireList
                    {

                    			newCompositeNode(grammarAccess.getCosUnaireAccess().getCosUnaireListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CosUnaireList_0=ruleCosUnaireList();

                    state._fsp--;


                    			current = this_CosUnaireList_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:1825:3: this_CosUnaireNumber_1= ruleCosUnaireNumber
                    {

                    			newCompositeNode(grammarAccess.getCosUnaireAccess().getCosUnaireNumberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CosUnaireNumber_1=ruleCosUnaireNumber();

                    state._fsp--;


                    			current = this_CosUnaireNumber_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCosUnaire"


    // $ANTLR start "entryRuleCosUnaireList"
    // InternalJavaSFT.g:1837:1: entryRuleCosUnaireList returns [EObject current=null] : iv_ruleCosUnaireList= ruleCosUnaireList EOF ;
    public final EObject entryRuleCosUnaireList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCosUnaireList = null;


        try {
            // InternalJavaSFT.g:1837:54: (iv_ruleCosUnaireList= ruleCosUnaireList EOF )
            // InternalJavaSFT.g:1838:2: iv_ruleCosUnaireList= ruleCosUnaireList EOF
            {
             newCompositeNode(grammarAccess.getCosUnaireListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCosUnaireList=ruleCosUnaireList();

            state._fsp--;

             current =iv_ruleCosUnaireList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCosUnaireList"


    // $ANTLR start "ruleCosUnaireList"
    // InternalJavaSFT.g:1844:1: ruleCosUnaireList returns [EObject current=null] : ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.cos(e)).collect(Collectors.toList());' ) ;
    public final EObject ruleCosUnaireList() throws RecognitionException {
        EObject current = null;

        Token lv_listNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_listNameRight_6_0=null;
        Token otherlv_7=null;
        EObject lv_typeListLeft_0_0 = null;

        EObject lv_typeListRight_4_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:1850:2: ( ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.cos(e)).collect(Collectors.toList());' ) )
            // InternalJavaSFT.g:1851:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.cos(e)).collect(Collectors.toList());' )
            {
            // InternalJavaSFT.g:1851:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.cos(e)).collect(Collectors.toList());' )
            // InternalJavaSFT.g:1852:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.cos(e)).collect(Collectors.toList());'
            {
            // InternalJavaSFT.g:1852:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:1853:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:1853:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            // InternalJavaSFT.g:1854:5: lv_typeListLeft_0_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getCosUnaireListAccess().getTypeListLeftTypeListNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListLeft_0_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCosUnaireListRule());
            					}
            					set(
            						current,
            						"typeListLeft",
            						lv_typeListLeft_0_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:1871:3: ( (lv_listNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:1872:4: (lv_listNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:1872:4: (lv_listNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:1873:5: lv_listNameLeft_1_0= RULE_ID
            {
            lv_listNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_listNameLeft_1_0, grammarAccess.getCosUnaireListAccess().getListNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCosUnaireListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameLeft",
            						lv_listNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getCosUnaireListAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getCosUnaireListAccess().getLeftParenthesisKeyword_3());
            		
            // InternalJavaSFT.g:1897:3: ( (lv_typeListRight_4_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:1898:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:1898:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            // InternalJavaSFT.g:1899:5: lv_typeListRight_4_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getCosUnaireListAccess().getTypeListRightTypeListNumberParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_typeListRight_4_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCosUnaireListRule());
            					}
            					set(
            						current,
            						"typeListRight",
            						lv_typeListRight_4_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getCosUnaireListAccess().getRightParenthesisKeyword_5());
            		
            // InternalJavaSFT.g:1920:3: ( (lv_listNameRight_6_0= RULE_ID ) )
            // InternalJavaSFT.g:1921:4: (lv_listNameRight_6_0= RULE_ID )
            {
            // InternalJavaSFT.g:1921:4: (lv_listNameRight_6_0= RULE_ID )
            // InternalJavaSFT.g:1922:5: lv_listNameRight_6_0= RULE_ID
            {
            lv_listNameRight_6_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            					newLeafNode(lv_listNameRight_6_0, grammarAccess.getCosUnaireListAccess().getListNameRightIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCosUnaireListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,49,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCosUnaireListAccess().getStreamMapEFloatMathCosECollectCollectorsToListKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCosUnaireList"


    // $ANTLR start "entryRuleCosUnaireNumber"
    // InternalJavaSFT.g:1946:1: entryRuleCosUnaireNumber returns [EObject current=null] : iv_ruleCosUnaireNumber= ruleCosUnaireNumber EOF ;
    public final EObject entryRuleCosUnaireNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCosUnaireNumber = null;


        try {
            // InternalJavaSFT.g:1946:56: (iv_ruleCosUnaireNumber= ruleCosUnaireNumber EOF )
            // InternalJavaSFT.g:1947:2: iv_ruleCosUnaireNumber= ruleCosUnaireNumber EOF
            {
             newCompositeNode(grammarAccess.getCosUnaireNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCosUnaireNumber=ruleCosUnaireNumber();

            state._fsp--;

             current =iv_ruleCosUnaireNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCosUnaireNumber"


    // $ANTLR start "ruleCosUnaireNumber"
    // InternalJavaSFT.g:1953:1: ruleCosUnaireNumber returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.cos(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleCosUnaireNumber() throws RecognitionException {
        EObject current = null;

        Token lv_varNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_varNameRight_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:1959:2: ( ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.cos(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalJavaSFT.g:1960:2: ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.cos(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalJavaSFT.g:1960:2: ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.cos(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')' )
            // InternalJavaSFT.g:1961:3: ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.cos(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')'
            {
            // InternalJavaSFT.g:1961:3: ( (lv_type_0_0= ruleTypeNumber ) )
            // InternalJavaSFT.g:1962:4: (lv_type_0_0= ruleTypeNumber )
            {
            // InternalJavaSFT.g:1962:4: (lv_type_0_0= ruleTypeNumber )
            // InternalJavaSFT.g:1963:5: lv_type_0_0= ruleTypeNumber
            {

            					newCompositeNode(grammarAccess.getCosUnaireNumberAccess().getTypeTypeNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_0_0=ruleTypeNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCosUnaireNumberRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"projetIDM.JavaSFT.TypeNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:1980:3: ( (lv_varNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:1981:4: (lv_varNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:1981:4: (lv_varNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:1982:5: lv_varNameLeft_1_0= RULE_ID
            {
            lv_varNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_varNameLeft_1_0, grammarAccess.getCosUnaireNumberAccess().getVarNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCosUnaireNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameLeft",
            						lv_varNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getCosUnaireNumberAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,50,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getCosUnaireNumberAccess().getFloatMathCosKeyword_3());
            		
            // InternalJavaSFT.g:2006:3: ( (lv_varNameRight_4_0= RULE_ID ) )
            // InternalJavaSFT.g:2007:4: (lv_varNameRight_4_0= RULE_ID )
            {
            // InternalJavaSFT.g:2007:4: (lv_varNameRight_4_0= RULE_ID )
            // InternalJavaSFT.g:2008:5: lv_varNameRight_4_0= RULE_ID
            {
            lv_varNameRight_4_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_varNameRight_4_0, grammarAccess.getCosUnaireNumberAccess().getVarNameRightIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCosUnaireNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameRight",
            						lv_varNameRight_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCosUnaireNumberAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCosUnaireNumber"


    // $ANTLR start "entryRuleSinUnaire"
    // InternalJavaSFT.g:2032:1: entryRuleSinUnaire returns [EObject current=null] : iv_ruleSinUnaire= ruleSinUnaire EOF ;
    public final EObject entryRuleSinUnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSinUnaire = null;


        try {
            // InternalJavaSFT.g:2032:50: (iv_ruleSinUnaire= ruleSinUnaire EOF )
            // InternalJavaSFT.g:2033:2: iv_ruleSinUnaire= ruleSinUnaire EOF
            {
             newCompositeNode(grammarAccess.getSinUnaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSinUnaire=ruleSinUnaire();

            state._fsp--;

             current =iv_ruleSinUnaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSinUnaire"


    // $ANTLR start "ruleSinUnaire"
    // InternalJavaSFT.g:2039:1: ruleSinUnaire returns [EObject current=null] : (this_SinUnaireList_0= ruleSinUnaireList | this_SinUnaireNumber_1= ruleSinUnaireNumber ) ;
    public final EObject ruleSinUnaire() throws RecognitionException {
        EObject current = null;

        EObject this_SinUnaireList_0 = null;

        EObject this_SinUnaireNumber_1 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:2045:2: ( (this_SinUnaireList_0= ruleSinUnaireList | this_SinUnaireNumber_1= ruleSinUnaireNumber ) )
            // InternalJavaSFT.g:2046:2: (this_SinUnaireList_0= ruleSinUnaireList | this_SinUnaireNumber_1= ruleSinUnaireNumber )
            {
            // InternalJavaSFT.g:2046:2: (this_SinUnaireList_0= ruleSinUnaireList | this_SinUnaireNumber_1= ruleSinUnaireNumber )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=RULE_TYPE_INTEGER && LA13_0<=RULE_TYPE_FLOAT)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalJavaSFT.g:2047:3: this_SinUnaireList_0= ruleSinUnaireList
                    {

                    			newCompositeNode(grammarAccess.getSinUnaireAccess().getSinUnaireListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SinUnaireList_0=ruleSinUnaireList();

                    state._fsp--;


                    			current = this_SinUnaireList_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:2056:3: this_SinUnaireNumber_1= ruleSinUnaireNumber
                    {

                    			newCompositeNode(grammarAccess.getSinUnaireAccess().getSinUnaireNumberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SinUnaireNumber_1=ruleSinUnaireNumber();

                    state._fsp--;


                    			current = this_SinUnaireNumber_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSinUnaire"


    // $ANTLR start "entryRuleSinUnaireList"
    // InternalJavaSFT.g:2068:1: entryRuleSinUnaireList returns [EObject current=null] : iv_ruleSinUnaireList= ruleSinUnaireList EOF ;
    public final EObject entryRuleSinUnaireList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSinUnaireList = null;


        try {
            // InternalJavaSFT.g:2068:54: (iv_ruleSinUnaireList= ruleSinUnaireList EOF )
            // InternalJavaSFT.g:2069:2: iv_ruleSinUnaireList= ruleSinUnaireList EOF
            {
             newCompositeNode(grammarAccess.getSinUnaireListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSinUnaireList=ruleSinUnaireList();

            state._fsp--;

             current =iv_ruleSinUnaireList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSinUnaireList"


    // $ANTLR start "ruleSinUnaireList"
    // InternalJavaSFT.g:2075:1: ruleSinUnaireList returns [EObject current=null] : ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.sin(e)).collect(Collectors.toList());' ) ;
    public final EObject ruleSinUnaireList() throws RecognitionException {
        EObject current = null;

        Token lv_listNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_listNameRight_6_0=null;
        Token otherlv_7=null;
        EObject lv_typeListLeft_0_0 = null;

        EObject lv_typeListRight_4_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:2081:2: ( ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.sin(e)).collect(Collectors.toList());' ) )
            // InternalJavaSFT.g:2082:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.sin(e)).collect(Collectors.toList());' )
            {
            // InternalJavaSFT.g:2082:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.sin(e)).collect(Collectors.toList());' )
            // InternalJavaSFT.g:2083:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.sin(e)).collect(Collectors.toList());'
            {
            // InternalJavaSFT.g:2083:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:2084:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:2084:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            // InternalJavaSFT.g:2085:5: lv_typeListLeft_0_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getSinUnaireListAccess().getTypeListLeftTypeListNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListLeft_0_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSinUnaireListRule());
            					}
            					set(
            						current,
            						"typeListLeft",
            						lv_typeListLeft_0_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:2102:3: ( (lv_listNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:2103:4: (lv_listNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:2103:4: (lv_listNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:2104:5: lv_listNameLeft_1_0= RULE_ID
            {
            lv_listNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_listNameLeft_1_0, grammarAccess.getSinUnaireListAccess().getListNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSinUnaireListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameLeft",
            						lv_listNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getSinUnaireListAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getSinUnaireListAccess().getLeftParenthesisKeyword_3());
            		
            // InternalJavaSFT.g:2128:3: ( (lv_typeListRight_4_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:2129:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:2129:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            // InternalJavaSFT.g:2130:5: lv_typeListRight_4_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getSinUnaireListAccess().getTypeListRightTypeListNumberParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_typeListRight_4_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSinUnaireListRule());
            					}
            					set(
            						current,
            						"typeListRight",
            						lv_typeListRight_4_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getSinUnaireListAccess().getRightParenthesisKeyword_5());
            		
            // InternalJavaSFT.g:2151:3: ( (lv_listNameRight_6_0= RULE_ID ) )
            // InternalJavaSFT.g:2152:4: (lv_listNameRight_6_0= RULE_ID )
            {
            // InternalJavaSFT.g:2152:4: (lv_listNameRight_6_0= RULE_ID )
            // InternalJavaSFT.g:2153:5: lv_listNameRight_6_0= RULE_ID
            {
            lv_listNameRight_6_0=(Token)match(input,RULE_ID,FOLLOW_44); 

            					newLeafNode(lv_listNameRight_6_0, grammarAccess.getSinUnaireListAccess().getListNameRightIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSinUnaireListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,51,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSinUnaireListAccess().getStreamMapEFloatMathSinECollectCollectorsToListKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSinUnaireList"


    // $ANTLR start "entryRuleSinUnaireNumber"
    // InternalJavaSFT.g:2177:1: entryRuleSinUnaireNumber returns [EObject current=null] : iv_ruleSinUnaireNumber= ruleSinUnaireNumber EOF ;
    public final EObject entryRuleSinUnaireNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSinUnaireNumber = null;


        try {
            // InternalJavaSFT.g:2177:56: (iv_ruleSinUnaireNumber= ruleSinUnaireNumber EOF )
            // InternalJavaSFT.g:2178:2: iv_ruleSinUnaireNumber= ruleSinUnaireNumber EOF
            {
             newCompositeNode(grammarAccess.getSinUnaireNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSinUnaireNumber=ruleSinUnaireNumber();

            state._fsp--;

             current =iv_ruleSinUnaireNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSinUnaireNumber"


    // $ANTLR start "ruleSinUnaireNumber"
    // InternalJavaSFT.g:2184:1: ruleSinUnaireNumber returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.sin(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleSinUnaireNumber() throws RecognitionException {
        EObject current = null;

        Token lv_varNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_varNameRight_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:2190:2: ( ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.sin(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalJavaSFT.g:2191:2: ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.sin(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalJavaSFT.g:2191:2: ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.sin(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')' )
            // InternalJavaSFT.g:2192:3: ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.sin(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')'
            {
            // InternalJavaSFT.g:2192:3: ( (lv_type_0_0= ruleTypeNumber ) )
            // InternalJavaSFT.g:2193:4: (lv_type_0_0= ruleTypeNumber )
            {
            // InternalJavaSFT.g:2193:4: (lv_type_0_0= ruleTypeNumber )
            // InternalJavaSFT.g:2194:5: lv_type_0_0= ruleTypeNumber
            {

            					newCompositeNode(grammarAccess.getSinUnaireNumberAccess().getTypeTypeNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_0_0=ruleTypeNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSinUnaireNumberRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"projetIDM.JavaSFT.TypeNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:2211:3: ( (lv_varNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:2212:4: (lv_varNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:2212:4: (lv_varNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:2213:5: lv_varNameLeft_1_0= RULE_ID
            {
            lv_varNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_varNameLeft_1_0, grammarAccess.getSinUnaireNumberAccess().getVarNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSinUnaireNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameLeft",
            						lv_varNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getSinUnaireNumberAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,52,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getSinUnaireNumberAccess().getFloatMathSinKeyword_3());
            		
            // InternalJavaSFT.g:2237:3: ( (lv_varNameRight_4_0= RULE_ID ) )
            // InternalJavaSFT.g:2238:4: (lv_varNameRight_4_0= RULE_ID )
            {
            // InternalJavaSFT.g:2238:4: (lv_varNameRight_4_0= RULE_ID )
            // InternalJavaSFT.g:2239:5: lv_varNameRight_4_0= RULE_ID
            {
            lv_varNameRight_4_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_varNameRight_4_0, grammarAccess.getSinUnaireNumberAccess().getVarNameRightIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSinUnaireNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameRight",
            						lv_varNameRight_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSinUnaireNumberAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSinUnaireNumber"


    // $ANTLR start "entryRuleSqrtUnaire"
    // InternalJavaSFT.g:2263:1: entryRuleSqrtUnaire returns [EObject current=null] : iv_ruleSqrtUnaire= ruleSqrtUnaire EOF ;
    public final EObject entryRuleSqrtUnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqrtUnaire = null;


        try {
            // InternalJavaSFT.g:2263:51: (iv_ruleSqrtUnaire= ruleSqrtUnaire EOF )
            // InternalJavaSFT.g:2264:2: iv_ruleSqrtUnaire= ruleSqrtUnaire EOF
            {
             newCompositeNode(grammarAccess.getSqrtUnaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSqrtUnaire=ruleSqrtUnaire();

            state._fsp--;

             current =iv_ruleSqrtUnaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSqrtUnaire"


    // $ANTLR start "ruleSqrtUnaire"
    // InternalJavaSFT.g:2270:1: ruleSqrtUnaire returns [EObject current=null] : (this_SqrtUnaireList_0= ruleSqrtUnaireList | this_SqrtUnaireNumber_1= ruleSqrtUnaireNumber ) ;
    public final EObject ruleSqrtUnaire() throws RecognitionException {
        EObject current = null;

        EObject this_SqrtUnaireList_0 = null;

        EObject this_SqrtUnaireNumber_1 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:2276:2: ( (this_SqrtUnaireList_0= ruleSqrtUnaireList | this_SqrtUnaireNumber_1= ruleSqrtUnaireNumber ) )
            // InternalJavaSFT.g:2277:2: (this_SqrtUnaireList_0= ruleSqrtUnaireList | this_SqrtUnaireNumber_1= ruleSqrtUnaireNumber )
            {
            // InternalJavaSFT.g:2277:2: (this_SqrtUnaireList_0= ruleSqrtUnaireList | this_SqrtUnaireNumber_1= ruleSqrtUnaireNumber )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=RULE_TYPE_INTEGER && LA14_0<=RULE_TYPE_FLOAT)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalJavaSFT.g:2278:3: this_SqrtUnaireList_0= ruleSqrtUnaireList
                    {

                    			newCompositeNode(grammarAccess.getSqrtUnaireAccess().getSqrtUnaireListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SqrtUnaireList_0=ruleSqrtUnaireList();

                    state._fsp--;


                    			current = this_SqrtUnaireList_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:2287:3: this_SqrtUnaireNumber_1= ruleSqrtUnaireNumber
                    {

                    			newCompositeNode(grammarAccess.getSqrtUnaireAccess().getSqrtUnaireNumberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SqrtUnaireNumber_1=ruleSqrtUnaireNumber();

                    state._fsp--;


                    			current = this_SqrtUnaireNumber_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSqrtUnaire"


    // $ANTLR start "entryRuleSqrtUnaireList"
    // InternalJavaSFT.g:2299:1: entryRuleSqrtUnaireList returns [EObject current=null] : iv_ruleSqrtUnaireList= ruleSqrtUnaireList EOF ;
    public final EObject entryRuleSqrtUnaireList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqrtUnaireList = null;


        try {
            // InternalJavaSFT.g:2299:55: (iv_ruleSqrtUnaireList= ruleSqrtUnaireList EOF )
            // InternalJavaSFT.g:2300:2: iv_ruleSqrtUnaireList= ruleSqrtUnaireList EOF
            {
             newCompositeNode(grammarAccess.getSqrtUnaireListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSqrtUnaireList=ruleSqrtUnaireList();

            state._fsp--;

             current =iv_ruleSqrtUnaireList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSqrtUnaireList"


    // $ANTLR start "ruleSqrtUnaireList"
    // InternalJavaSFT.g:2306:1: ruleSqrtUnaireList returns [EObject current=null] : ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.sqrt(e)).collect(Collectors.toList());' ) ;
    public final EObject ruleSqrtUnaireList() throws RecognitionException {
        EObject current = null;

        Token lv_listNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_listNameRight_6_0=null;
        Token otherlv_7=null;
        EObject lv_typeListLeft_0_0 = null;

        EObject lv_typeListRight_4_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:2312:2: ( ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.sqrt(e)).collect(Collectors.toList());' ) )
            // InternalJavaSFT.g:2313:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.sqrt(e)).collect(Collectors.toList());' )
            {
            // InternalJavaSFT.g:2313:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.sqrt(e)).collect(Collectors.toList());' )
            // InternalJavaSFT.g:2314:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.sqrt(e)).collect(Collectors.toList());'
            {
            // InternalJavaSFT.g:2314:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:2315:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:2315:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            // InternalJavaSFT.g:2316:5: lv_typeListLeft_0_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getSqrtUnaireListAccess().getTypeListLeftTypeListNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListLeft_0_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSqrtUnaireListRule());
            					}
            					set(
            						current,
            						"typeListLeft",
            						lv_typeListLeft_0_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:2333:3: ( (lv_listNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:2334:4: (lv_listNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:2334:4: (lv_listNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:2335:5: lv_listNameLeft_1_0= RULE_ID
            {
            lv_listNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_listNameLeft_1_0, grammarAccess.getSqrtUnaireListAccess().getListNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSqrtUnaireListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameLeft",
            						lv_listNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getSqrtUnaireListAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getSqrtUnaireListAccess().getLeftParenthesisKeyword_3());
            		
            // InternalJavaSFT.g:2359:3: ( (lv_typeListRight_4_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:2360:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:2360:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            // InternalJavaSFT.g:2361:5: lv_typeListRight_4_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getSqrtUnaireListAccess().getTypeListRightTypeListNumberParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_typeListRight_4_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSqrtUnaireListRule());
            					}
            					set(
            						current,
            						"typeListRight",
            						lv_typeListRight_4_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getSqrtUnaireListAccess().getRightParenthesisKeyword_5());
            		
            // InternalJavaSFT.g:2382:3: ( (lv_listNameRight_6_0= RULE_ID ) )
            // InternalJavaSFT.g:2383:4: (lv_listNameRight_6_0= RULE_ID )
            {
            // InternalJavaSFT.g:2383:4: (lv_listNameRight_6_0= RULE_ID )
            // InternalJavaSFT.g:2384:5: lv_listNameRight_6_0= RULE_ID
            {
            lv_listNameRight_6_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(lv_listNameRight_6_0, grammarAccess.getSqrtUnaireListAccess().getListNameRightIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSqrtUnaireListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,53,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSqrtUnaireListAccess().getStreamMapEFloatMathSqrtECollectCollectorsToListKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSqrtUnaireList"


    // $ANTLR start "entryRuleSqrtUnaireNumber"
    // InternalJavaSFT.g:2408:1: entryRuleSqrtUnaireNumber returns [EObject current=null] : iv_ruleSqrtUnaireNumber= ruleSqrtUnaireNumber EOF ;
    public final EObject entryRuleSqrtUnaireNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSqrtUnaireNumber = null;


        try {
            // InternalJavaSFT.g:2408:57: (iv_ruleSqrtUnaireNumber= ruleSqrtUnaireNumber EOF )
            // InternalJavaSFT.g:2409:2: iv_ruleSqrtUnaireNumber= ruleSqrtUnaireNumber EOF
            {
             newCompositeNode(grammarAccess.getSqrtUnaireNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSqrtUnaireNumber=ruleSqrtUnaireNumber();

            state._fsp--;

             current =iv_ruleSqrtUnaireNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSqrtUnaireNumber"


    // $ANTLR start "ruleSqrtUnaireNumber"
    // InternalJavaSFT.g:2415:1: ruleSqrtUnaireNumber returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.sqrt(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleSqrtUnaireNumber() throws RecognitionException {
        EObject current = null;

        Token lv_varNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_varNameRight_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:2421:2: ( ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.sqrt(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalJavaSFT.g:2422:2: ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.sqrt(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalJavaSFT.g:2422:2: ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.sqrt(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')' )
            // InternalJavaSFT.g:2423:3: ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.sqrt(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')'
            {
            // InternalJavaSFT.g:2423:3: ( (lv_type_0_0= ruleTypeNumber ) )
            // InternalJavaSFT.g:2424:4: (lv_type_0_0= ruleTypeNumber )
            {
            // InternalJavaSFT.g:2424:4: (lv_type_0_0= ruleTypeNumber )
            // InternalJavaSFT.g:2425:5: lv_type_0_0= ruleTypeNumber
            {

            					newCompositeNode(grammarAccess.getSqrtUnaireNumberAccess().getTypeTypeNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_0_0=ruleTypeNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSqrtUnaireNumberRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"projetIDM.JavaSFT.TypeNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:2442:3: ( (lv_varNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:2443:4: (lv_varNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:2443:4: (lv_varNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:2444:5: lv_varNameLeft_1_0= RULE_ID
            {
            lv_varNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_varNameLeft_1_0, grammarAccess.getSqrtUnaireNumberAccess().getVarNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSqrtUnaireNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameLeft",
            						lv_varNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getSqrtUnaireNumberAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,54,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getSqrtUnaireNumberAccess().getFloatMathSqrtKeyword_3());
            		
            // InternalJavaSFT.g:2468:3: ( (lv_varNameRight_4_0= RULE_ID ) )
            // InternalJavaSFT.g:2469:4: (lv_varNameRight_4_0= RULE_ID )
            {
            // InternalJavaSFT.g:2469:4: (lv_varNameRight_4_0= RULE_ID )
            // InternalJavaSFT.g:2470:5: lv_varNameRight_4_0= RULE_ID
            {
            lv_varNameRight_4_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_varNameRight_4_0, grammarAccess.getSqrtUnaireNumberAccess().getVarNameRightIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSqrtUnaireNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameRight",
            						lv_varNameRight_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSqrtUnaireNumberAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSqrtUnaireNumber"


    // $ANTLR start "entryRuleExpUnaire"
    // InternalJavaSFT.g:2494:1: entryRuleExpUnaire returns [EObject current=null] : iv_ruleExpUnaire= ruleExpUnaire EOF ;
    public final EObject entryRuleExpUnaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpUnaire = null;


        try {
            // InternalJavaSFT.g:2494:50: (iv_ruleExpUnaire= ruleExpUnaire EOF )
            // InternalJavaSFT.g:2495:2: iv_ruleExpUnaire= ruleExpUnaire EOF
            {
             newCompositeNode(grammarAccess.getExpUnaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpUnaire=ruleExpUnaire();

            state._fsp--;

             current =iv_ruleExpUnaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpUnaire"


    // $ANTLR start "ruleExpUnaire"
    // InternalJavaSFT.g:2501:1: ruleExpUnaire returns [EObject current=null] : (this_ExpUnaireList_0= ruleExpUnaireList | this_ExpUnaireNumber_1= ruleExpUnaireNumber ) ;
    public final EObject ruleExpUnaire() throws RecognitionException {
        EObject current = null;

        EObject this_ExpUnaireList_0 = null;

        EObject this_ExpUnaireNumber_1 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:2507:2: ( (this_ExpUnaireList_0= ruleExpUnaireList | this_ExpUnaireNumber_1= ruleExpUnaireNumber ) )
            // InternalJavaSFT.g:2508:2: (this_ExpUnaireList_0= ruleExpUnaireList | this_ExpUnaireNumber_1= ruleExpUnaireNumber )
            {
            // InternalJavaSFT.g:2508:2: (this_ExpUnaireList_0= ruleExpUnaireList | this_ExpUnaireNumber_1= ruleExpUnaireNumber )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=RULE_TYPE_INTEGER && LA15_0<=RULE_TYPE_FLOAT)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalJavaSFT.g:2509:3: this_ExpUnaireList_0= ruleExpUnaireList
                    {

                    			newCompositeNode(grammarAccess.getExpUnaireAccess().getExpUnaireListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpUnaireList_0=ruleExpUnaireList();

                    state._fsp--;


                    			current = this_ExpUnaireList_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:2518:3: this_ExpUnaireNumber_1= ruleExpUnaireNumber
                    {

                    			newCompositeNode(grammarAccess.getExpUnaireAccess().getExpUnaireNumberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExpUnaireNumber_1=ruleExpUnaireNumber();

                    state._fsp--;


                    			current = this_ExpUnaireNumber_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpUnaire"


    // $ANTLR start "entryRuleExpUnaireList"
    // InternalJavaSFT.g:2530:1: entryRuleExpUnaireList returns [EObject current=null] : iv_ruleExpUnaireList= ruleExpUnaireList EOF ;
    public final EObject entryRuleExpUnaireList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpUnaireList = null;


        try {
            // InternalJavaSFT.g:2530:54: (iv_ruleExpUnaireList= ruleExpUnaireList EOF )
            // InternalJavaSFT.g:2531:2: iv_ruleExpUnaireList= ruleExpUnaireList EOF
            {
             newCompositeNode(grammarAccess.getExpUnaireListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpUnaireList=ruleExpUnaireList();

            state._fsp--;

             current =iv_ruleExpUnaireList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpUnaireList"


    // $ANTLR start "ruleExpUnaireList"
    // InternalJavaSFT.g:2537:1: ruleExpUnaireList returns [EObject current=null] : ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.exp(e)).collect(Collectors.toList());' ) ;
    public final EObject ruleExpUnaireList() throws RecognitionException {
        EObject current = null;

        Token lv_listNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_listNameRight_6_0=null;
        Token otherlv_7=null;
        EObject lv_typeListLeft_0_0 = null;

        EObject lv_typeListRight_4_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:2543:2: ( ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.exp(e)).collect(Collectors.toList());' ) )
            // InternalJavaSFT.g:2544:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.exp(e)).collect(Collectors.toList());' )
            {
            // InternalJavaSFT.g:2544:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.exp(e)).collect(Collectors.toList());' )
            // InternalJavaSFT.g:2545:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' ( (lv_listNameRight_6_0= RULE_ID ) ) otherlv_7= '.stream().map(e->(float)Math.exp(e)).collect(Collectors.toList());'
            {
            // InternalJavaSFT.g:2545:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:2546:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:2546:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            // InternalJavaSFT.g:2547:5: lv_typeListLeft_0_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getExpUnaireListAccess().getTypeListLeftTypeListNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListLeft_0_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpUnaireListRule());
            					}
            					set(
            						current,
            						"typeListLeft",
            						lv_typeListLeft_0_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:2564:3: ( (lv_listNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:2565:4: (lv_listNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:2565:4: (lv_listNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:2566:5: lv_listNameLeft_1_0= RULE_ID
            {
            lv_listNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_listNameLeft_1_0, grammarAccess.getExpUnaireListAccess().getListNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpUnaireListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameLeft",
            						lv_listNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getExpUnaireListAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getExpUnaireListAccess().getLeftParenthesisKeyword_3());
            		
            // InternalJavaSFT.g:2590:3: ( (lv_typeListRight_4_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:2591:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:2591:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            // InternalJavaSFT.g:2592:5: lv_typeListRight_4_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getExpUnaireListAccess().getTypeListRightTypeListNumberParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_typeListRight_4_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpUnaireListRule());
            					}
            					set(
            						current,
            						"typeListRight",
            						lv_typeListRight_4_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getExpUnaireListAccess().getRightParenthesisKeyword_5());
            		
            // InternalJavaSFT.g:2613:3: ( (lv_listNameRight_6_0= RULE_ID ) )
            // InternalJavaSFT.g:2614:4: (lv_listNameRight_6_0= RULE_ID )
            {
            // InternalJavaSFT.g:2614:4: (lv_listNameRight_6_0= RULE_ID )
            // InternalJavaSFT.g:2615:5: lv_listNameRight_6_0= RULE_ID
            {
            lv_listNameRight_6_0=(Token)match(input,RULE_ID,FOLLOW_48); 

            					newLeafNode(lv_listNameRight_6_0, grammarAccess.getExpUnaireListAccess().getListNameRightIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpUnaireListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,55,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExpUnaireListAccess().getStreamMapEFloatMathExpECollectCollectorsToListKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpUnaireList"


    // $ANTLR start "entryRuleExpUnaireNumber"
    // InternalJavaSFT.g:2639:1: entryRuleExpUnaireNumber returns [EObject current=null] : iv_ruleExpUnaireNumber= ruleExpUnaireNumber EOF ;
    public final EObject entryRuleExpUnaireNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpUnaireNumber = null;


        try {
            // InternalJavaSFT.g:2639:56: (iv_ruleExpUnaireNumber= ruleExpUnaireNumber EOF )
            // InternalJavaSFT.g:2640:2: iv_ruleExpUnaireNumber= ruleExpUnaireNumber EOF
            {
             newCompositeNode(grammarAccess.getExpUnaireNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpUnaireNumber=ruleExpUnaireNumber();

            state._fsp--;

             current =iv_ruleExpUnaireNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpUnaireNumber"


    // $ANTLR start "ruleExpUnaireNumber"
    // InternalJavaSFT.g:2646:1: ruleExpUnaireNumber returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.exp(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')' ) ;
    public final EObject ruleExpUnaireNumber() throws RecognitionException {
        EObject current = null;

        Token lv_varNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_varNameRight_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:2652:2: ( ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.exp(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')' ) )
            // InternalJavaSFT.g:2653:2: ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.exp(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')' )
            {
            // InternalJavaSFT.g:2653:2: ( ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.exp(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')' )
            // InternalJavaSFT.g:2654:3: ( (lv_type_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(float)Math.exp(' ( (lv_varNameRight_4_0= RULE_ID ) ) otherlv_5= ')'
            {
            // InternalJavaSFT.g:2654:3: ( (lv_type_0_0= ruleTypeNumber ) )
            // InternalJavaSFT.g:2655:4: (lv_type_0_0= ruleTypeNumber )
            {
            // InternalJavaSFT.g:2655:4: (lv_type_0_0= ruleTypeNumber )
            // InternalJavaSFT.g:2656:5: lv_type_0_0= ruleTypeNumber
            {

            					newCompositeNode(grammarAccess.getExpUnaireNumberAccess().getTypeTypeNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_type_0_0=ruleTypeNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpUnaireNumberRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"projetIDM.JavaSFT.TypeNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:2673:3: ( (lv_varNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:2674:4: (lv_varNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:2674:4: (lv_varNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:2675:5: lv_varNameLeft_1_0= RULE_ID
            {
            lv_varNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_varNameLeft_1_0, grammarAccess.getExpUnaireNumberAccess().getVarNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpUnaireNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameLeft",
            						lv_varNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getExpUnaireNumberAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,56,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getExpUnaireNumberAccess().getFloatMathExpKeyword_3());
            		
            // InternalJavaSFT.g:2699:3: ( (lv_varNameRight_4_0= RULE_ID ) )
            // InternalJavaSFT.g:2700:4: (lv_varNameRight_4_0= RULE_ID )
            {
            // InternalJavaSFT.g:2700:4: (lv_varNameRight_4_0= RULE_ID )
            // InternalJavaSFT.g:2701:5: lv_varNameRight_4_0= RULE_ID
            {
            lv_varNameRight_4_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_varNameRight_4_0, grammarAccess.getExpUnaireNumberAccess().getVarNameRightIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpUnaireNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameRight",
            						lv_varNameRight_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExpUnaireNumberAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpUnaireNumber"


    // $ANTLR start "entryRuleSumBinaire"
    // InternalJavaSFT.g:2725:1: entryRuleSumBinaire returns [EObject current=null] : iv_ruleSumBinaire= ruleSumBinaire EOF ;
    public final EObject entryRuleSumBinaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumBinaire = null;


        try {
            // InternalJavaSFT.g:2725:51: (iv_ruleSumBinaire= ruleSumBinaire EOF )
            // InternalJavaSFT.g:2726:2: iv_ruleSumBinaire= ruleSumBinaire EOF
            {
             newCompositeNode(grammarAccess.getSumBinaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSumBinaire=ruleSumBinaire();

            state._fsp--;

             current =iv_ruleSumBinaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumBinaire"


    // $ANTLR start "ruleSumBinaire"
    // InternalJavaSFT.g:2732:1: ruleSumBinaire returns [EObject current=null] : (this_SumBinaireListVal_0= ruleSumBinaireListVal | this_SumBinaireListList_1= ruleSumBinaireListList | this_SumBinaireValVal_2= ruleSumBinaireValVal ) ;
    public final EObject ruleSumBinaire() throws RecognitionException {
        EObject current = null;

        EObject this_SumBinaireListVal_0 = null;

        EObject this_SumBinaireListList_1 = null;

        EObject this_SumBinaireValVal_2 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:2738:2: ( (this_SumBinaireListVal_0= ruleSumBinaireListVal | this_SumBinaireListList_1= ruleSumBinaireListList | this_SumBinaireValVal_2= ruleSumBinaireValVal ) )
            // InternalJavaSFT.g:2739:2: (this_SumBinaireListVal_0= ruleSumBinaireListVal | this_SumBinaireListList_1= ruleSumBinaireListList | this_SumBinaireValVal_2= ruleSumBinaireValVal )
            {
            // InternalJavaSFT.g:2739:2: (this_SumBinaireListVal_0= ruleSumBinaireListVal | this_SumBinaireListList_1= ruleSumBinaireListList | this_SumBinaireValVal_2= ruleSumBinaireValVal )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalJavaSFT.g:2740:3: this_SumBinaireListVal_0= ruleSumBinaireListVal
                    {

                    			newCompositeNode(grammarAccess.getSumBinaireAccess().getSumBinaireListValParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SumBinaireListVal_0=ruleSumBinaireListVal();

                    state._fsp--;


                    			current = this_SumBinaireListVal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:2749:3: this_SumBinaireListList_1= ruleSumBinaireListList
                    {

                    			newCompositeNode(grammarAccess.getSumBinaireAccess().getSumBinaireListListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SumBinaireListList_1=ruleSumBinaireListList();

                    state._fsp--;


                    			current = this_SumBinaireListList_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJavaSFT.g:2758:3: this_SumBinaireValVal_2= ruleSumBinaireValVal
                    {

                    			newCompositeNode(grammarAccess.getSumBinaireAccess().getSumBinaireValValParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SumBinaireValVal_2=ruleSumBinaireValVal();

                    state._fsp--;


                    			current = this_SumBinaireValVal_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumBinaire"


    // $ANTLR start "entryRuleSumBinaireListVal"
    // InternalJavaSFT.g:2770:1: entryRuleSumBinaireListVal returns [EObject current=null] : iv_ruleSumBinaireListVal= ruleSumBinaireListVal EOF ;
    public final EObject entryRuleSumBinaireListVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumBinaireListVal = null;


        try {
            // InternalJavaSFT.g:2770:58: (iv_ruleSumBinaireListVal= ruleSumBinaireListVal EOF )
            // InternalJavaSFT.g:2771:2: iv_ruleSumBinaireListVal= ruleSumBinaireListVal EOF
            {
             newCompositeNode(grammarAccess.getSumBinaireListValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSumBinaireListVal=ruleSumBinaireListVal();

            state._fsp--;

             current =iv_ruleSumBinaireListVal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumBinaireListVal"


    // $ANTLR start "ruleSumBinaireListVal"
    // InternalJavaSFT.g:2777:1: ruleSumBinaireListVal returns [EObject current=null] : ( ( (lv_typeListLeft_0_0= ruleTypeList ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeList ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->e+' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ').collect(Collectors.toList());' ) ;
    public final EObject ruleSumBinaireListVal() throws RecognitionException {
        EObject current = null;

        Token lv_listNameLeft_1_0=null;
        Token otherlv_2=null;
        Token lv_listNameRight_4_0=null;
        Token otherlv_5=null;
        Token lv_valNameRight_6_0=null;
        Token otherlv_7=null;
        EObject lv_typeListLeft_0_0 = null;

        EObject lv_typeListRight_3_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:2783:2: ( ( ( (lv_typeListLeft_0_0= ruleTypeList ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeList ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->e+' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ').collect(Collectors.toList());' ) )
            // InternalJavaSFT.g:2784:2: ( ( (lv_typeListLeft_0_0= ruleTypeList ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeList ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->e+' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ').collect(Collectors.toList());' )
            {
            // InternalJavaSFT.g:2784:2: ( ( (lv_typeListLeft_0_0= ruleTypeList ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeList ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->e+' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ').collect(Collectors.toList());' )
            // InternalJavaSFT.g:2785:3: ( (lv_typeListLeft_0_0= ruleTypeList ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeList ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->e+' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ').collect(Collectors.toList());'
            {
            // InternalJavaSFT.g:2785:3: ( (lv_typeListLeft_0_0= ruleTypeList ) )
            // InternalJavaSFT.g:2786:4: (lv_typeListLeft_0_0= ruleTypeList )
            {
            // InternalJavaSFT.g:2786:4: (lv_typeListLeft_0_0= ruleTypeList )
            // InternalJavaSFT.g:2787:5: lv_typeListLeft_0_0= ruleTypeList
            {

            					newCompositeNode(grammarAccess.getSumBinaireListValAccess().getTypeListLeftTypeListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListLeft_0_0=ruleTypeList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumBinaireListValRule());
            					}
            					set(
            						current,
            						"typeListLeft",
            						lv_typeListLeft_0_0,
            						"projetIDM.JavaSFT.TypeList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:2804:3: ( (lv_listNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:2805:4: (lv_listNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:2805:4: (lv_listNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:2806:5: lv_listNameLeft_1_0= RULE_ID
            {
            lv_listNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_listNameLeft_1_0, grammarAccess.getSumBinaireListValAccess().getListNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSumBinaireListValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameLeft",
            						lv_listNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getSumBinaireListValAccess().getEqualsSignKeyword_2());
            		
            // InternalJavaSFT.g:2826:3: ( (lv_typeListRight_3_0= ruleTypeList ) )
            // InternalJavaSFT.g:2827:4: (lv_typeListRight_3_0= ruleTypeList )
            {
            // InternalJavaSFT.g:2827:4: (lv_typeListRight_3_0= ruleTypeList )
            // InternalJavaSFT.g:2828:5: lv_typeListRight_3_0= ruleTypeList
            {

            					newCompositeNode(grammarAccess.getSumBinaireListValAccess().getTypeListRightTypeListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListRight_3_0=ruleTypeList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumBinaireListValRule());
            					}
            					set(
            						current,
            						"typeListRight",
            						lv_typeListRight_3_0,
            						"projetIDM.JavaSFT.TypeList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:2845:3: ( (lv_listNameRight_4_0= RULE_ID ) )
            // InternalJavaSFT.g:2846:4: (lv_listNameRight_4_0= RULE_ID )
            {
            // InternalJavaSFT.g:2846:4: (lv_listNameRight_4_0= RULE_ID )
            // InternalJavaSFT.g:2847:5: lv_listNameRight_4_0= RULE_ID
            {
            lv_listNameRight_4_0=(Token)match(input,RULE_ID,FOLLOW_50); 

            					newLeafNode(lv_listNameRight_4_0, grammarAccess.getSumBinaireListValAccess().getListNameRightIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSumBinaireListValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,57,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getSumBinaireListValAccess().getStreamMapEEKeyword_5());
            		
            // InternalJavaSFT.g:2867:3: ( (lv_valNameRight_6_0= RULE_ID ) )
            // InternalJavaSFT.g:2868:4: (lv_valNameRight_6_0= RULE_ID )
            {
            // InternalJavaSFT.g:2868:4: (lv_valNameRight_6_0= RULE_ID )
            // InternalJavaSFT.g:2869:5: lv_valNameRight_6_0= RULE_ID
            {
            lv_valNameRight_6_0=(Token)match(input,RULE_ID,FOLLOW_51); 

            					newLeafNode(lv_valNameRight_6_0, grammarAccess.getSumBinaireListValAccess().getValNameRightIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSumBinaireListValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valNameRight",
            						lv_valNameRight_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSumBinaireListValAccess().getCollectCollectorsToListKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumBinaireListVal"


    // $ANTLR start "entryRuleSumBinaireListList"
    // InternalJavaSFT.g:2893:1: entryRuleSumBinaireListList returns [EObject current=null] : iv_ruleSumBinaireListList= ruleSumBinaireListList EOF ;
    public final EObject entryRuleSumBinaireListList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumBinaireListList = null;


        try {
            // InternalJavaSFT.g:2893:59: (iv_ruleSumBinaireListList= ruleSumBinaireListList EOF )
            // InternalJavaSFT.g:2894:2: iv_ruleSumBinaireListList= ruleSumBinaireListList EOF
            {
             newCompositeNode(grammarAccess.getSumBinaireListListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSumBinaireListList=ruleSumBinaireListList();

            state._fsp--;

             current =iv_ruleSumBinaireListList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumBinaireListList"


    // $ANTLR start "ruleSumBinaireListList"
    // InternalJavaSFT.g:2900:1: ruleSumBinaireListList returns [EObject current=null] : ( ( (lv_typeListLeft_0_0= ruleTypeList ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeList ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i)+' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i)).collect(Collectors.toList());' ) ;
    public final EObject ruleSumBinaireListList() throws RecognitionException {
        EObject current = null;

        Token lv_listNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_SIZEVAR_7=null;
        Token otherlv_8=null;
        Token lv_listNameRight_9_0=null;
        Token otherlv_10=null;
        Token lv_listNameRight2_11_0=null;
        Token otherlv_12=null;
        EObject lv_typeListLeft_0_0 = null;

        EObject lv_typeListRight_4_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:2906:2: ( ( ( (lv_typeListLeft_0_0= ruleTypeList ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeList ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i)+' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i)).collect(Collectors.toList());' ) )
            // InternalJavaSFT.g:2907:2: ( ( (lv_typeListLeft_0_0= ruleTypeList ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeList ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i)+' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i)).collect(Collectors.toList());' )
            {
            // InternalJavaSFT.g:2907:2: ( ( (lv_typeListLeft_0_0= ruleTypeList ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeList ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i)+' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i)).collect(Collectors.toList());' )
            // InternalJavaSFT.g:2908:3: ( (lv_typeListLeft_0_0= ruleTypeList ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeList ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i)+' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i)).collect(Collectors.toList());'
            {
            // InternalJavaSFT.g:2908:3: ( (lv_typeListLeft_0_0= ruleTypeList ) )
            // InternalJavaSFT.g:2909:4: (lv_typeListLeft_0_0= ruleTypeList )
            {
            // InternalJavaSFT.g:2909:4: (lv_typeListLeft_0_0= ruleTypeList )
            // InternalJavaSFT.g:2910:5: lv_typeListLeft_0_0= ruleTypeList
            {

            					newCompositeNode(grammarAccess.getSumBinaireListListAccess().getTypeListLeftTypeListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListLeft_0_0=ruleTypeList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumBinaireListListRule());
            					}
            					set(
            						current,
            						"typeListLeft",
            						lv_typeListLeft_0_0,
            						"projetIDM.JavaSFT.TypeList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:2927:3: ( (lv_listNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:2928:4: (lv_listNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:2928:4: (lv_listNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:2929:5: lv_listNameLeft_1_0= RULE_ID
            {
            lv_listNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_listNameLeft_1_0, grammarAccess.getSumBinaireListListAccess().getListNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSumBinaireListListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameLeft",
            						lv_listNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getSumBinaireListListAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getSumBinaireListListAccess().getLeftParenthesisKeyword_3());
            		
            // InternalJavaSFT.g:2953:3: ( (lv_typeListRight_4_0= ruleTypeList ) )
            // InternalJavaSFT.g:2954:4: (lv_typeListRight_4_0= ruleTypeList )
            {
            // InternalJavaSFT.g:2954:4: (lv_typeListRight_4_0= ruleTypeList )
            // InternalJavaSFT.g:2955:5: lv_typeListRight_4_0= ruleTypeList
            {

            					newCompositeNode(grammarAccess.getSumBinaireListListAccess().getTypeListRightTypeListParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_typeListRight_4_0=ruleTypeList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumBinaireListListRule());
            					}
            					set(
            						current,
            						"typeListRight",
            						lv_typeListRight_4_0,
            						"projetIDM.JavaSFT.TypeList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_52); 

            			newLeafNode(otherlv_5, grammarAccess.getSumBinaireListListAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,59,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getSumBinaireListListAccess().getIntStreamRange0Keyword_6());
            		
            this_SIZEVAR_7=(Token)match(input,RULE_SIZEVAR,FOLLOW_53); 

            			newLeafNode(this_SIZEVAR_7, grammarAccess.getSumBinaireListListAccess().getSIZEVARTerminalRuleCall_7());
            		
            otherlv_8=(Token)match(input,60,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getSumBinaireListListAccess().getMapToObjIKeyword_8());
            		
            // InternalJavaSFT.g:2988:3: ( (lv_listNameRight_9_0= RULE_ID ) )
            // InternalJavaSFT.g:2989:4: (lv_listNameRight_9_0= RULE_ID )
            {
            // InternalJavaSFT.g:2989:4: (lv_listNameRight_9_0= RULE_ID )
            // InternalJavaSFT.g:2990:5: lv_listNameRight_9_0= RULE_ID
            {
            lv_listNameRight_9_0=(Token)match(input,RULE_ID,FOLLOW_54); 

            					newLeafNode(lv_listNameRight_9_0, grammarAccess.getSumBinaireListListAccess().getListNameRightIDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSumBinaireListListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_9_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_10=(Token)match(input,61,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getSumBinaireListListAccess().getGetIKeyword_10());
            		
            // InternalJavaSFT.g:3010:3: ( (lv_listNameRight2_11_0= RULE_ID ) )
            // InternalJavaSFT.g:3011:4: (lv_listNameRight2_11_0= RULE_ID )
            {
            // InternalJavaSFT.g:3011:4: (lv_listNameRight2_11_0= RULE_ID )
            // InternalJavaSFT.g:3012:5: lv_listNameRight2_11_0= RULE_ID
            {
            lv_listNameRight2_11_0=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(lv_listNameRight2_11_0, grammarAccess.getSumBinaireListListAccess().getListNameRight2IDTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSumBinaireListListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight2",
            						lv_listNameRight2_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_12=(Token)match(input,62,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getSumBinaireListListAccess().getGetICollectCollectorsToListKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumBinaireListList"


    // $ANTLR start "entryRuleSumBinaireValVal"
    // InternalJavaSFT.g:3036:1: entryRuleSumBinaireValVal returns [EObject current=null] : iv_ruleSumBinaireValVal= ruleSumBinaireValVal EOF ;
    public final EObject entryRuleSumBinaireValVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumBinaireValVal = null;


        try {
            // InternalJavaSFT.g:3036:57: (iv_ruleSumBinaireValVal= ruleSumBinaireValVal EOF )
            // InternalJavaSFT.g:3037:2: iv_ruleSumBinaireValVal= ruleSumBinaireValVal EOF
            {
             newCompositeNode(grammarAccess.getSumBinaireValValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSumBinaireValVal=ruleSumBinaireValVal();

            state._fsp--;

             current =iv_ruleSumBinaireValVal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumBinaireValVal"


    // $ANTLR start "ruleSumBinaireValVal"
    // InternalJavaSFT.g:3043:1: ruleSumBinaireValVal returns [EObject current=null] : ( ( (lv_typeVarLeft_0_0= ruleType ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_varNameRight1_3_0= RULE_ID ) ) otherlv_4= '+' ( (lv_varNameRight2_5_0= RULE_ID ) ) ) ;
    public final EObject ruleSumBinaireValVal() throws RecognitionException {
        EObject current = null;

        Token lv_varNameLeft_1_0=null;
        Token otherlv_2=null;
        Token lv_varNameRight1_3_0=null;
        Token otherlv_4=null;
        Token lv_varNameRight2_5_0=null;
        AntlrDatatypeRuleToken lv_typeVarLeft_0_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:3049:2: ( ( ( (lv_typeVarLeft_0_0= ruleType ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_varNameRight1_3_0= RULE_ID ) ) otherlv_4= '+' ( (lv_varNameRight2_5_0= RULE_ID ) ) ) )
            // InternalJavaSFT.g:3050:2: ( ( (lv_typeVarLeft_0_0= ruleType ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_varNameRight1_3_0= RULE_ID ) ) otherlv_4= '+' ( (lv_varNameRight2_5_0= RULE_ID ) ) )
            {
            // InternalJavaSFT.g:3050:2: ( ( (lv_typeVarLeft_0_0= ruleType ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_varNameRight1_3_0= RULE_ID ) ) otherlv_4= '+' ( (lv_varNameRight2_5_0= RULE_ID ) ) )
            // InternalJavaSFT.g:3051:3: ( (lv_typeVarLeft_0_0= ruleType ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_varNameRight1_3_0= RULE_ID ) ) otherlv_4= '+' ( (lv_varNameRight2_5_0= RULE_ID ) )
            {
            // InternalJavaSFT.g:3051:3: ( (lv_typeVarLeft_0_0= ruleType ) )
            // InternalJavaSFT.g:3052:4: (lv_typeVarLeft_0_0= ruleType )
            {
            // InternalJavaSFT.g:3052:4: (lv_typeVarLeft_0_0= ruleType )
            // InternalJavaSFT.g:3053:5: lv_typeVarLeft_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getSumBinaireValValAccess().getTypeVarLeftTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeVarLeft_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumBinaireValValRule());
            					}
            					set(
            						current,
            						"typeVarLeft",
            						lv_typeVarLeft_0_0,
            						"projetIDM.JavaSFT.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:3070:3: ( (lv_varNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:3071:4: (lv_varNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:3071:4: (lv_varNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:3072:5: lv_varNameLeft_1_0= RULE_ID
            {
            lv_varNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_varNameLeft_1_0, grammarAccess.getSumBinaireValValAccess().getVarNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSumBinaireValValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameLeft",
            						lv_varNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getSumBinaireValValAccess().getEqualsSignKeyword_2());
            		
            // InternalJavaSFT.g:3092:3: ( (lv_varNameRight1_3_0= RULE_ID ) )
            // InternalJavaSFT.g:3093:4: (lv_varNameRight1_3_0= RULE_ID )
            {
            // InternalJavaSFT.g:3093:4: (lv_varNameRight1_3_0= RULE_ID )
            // InternalJavaSFT.g:3094:5: lv_varNameRight1_3_0= RULE_ID
            {
            lv_varNameRight1_3_0=(Token)match(input,RULE_ID,FOLLOW_56); 

            					newLeafNode(lv_varNameRight1_3_0, grammarAccess.getSumBinaireValValAccess().getVarNameRight1IDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSumBinaireValValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameRight1",
            						lv_varNameRight1_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,63,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getSumBinaireValValAccess().getPlusSignKeyword_4());
            		
            // InternalJavaSFT.g:3114:3: ( (lv_varNameRight2_5_0= RULE_ID ) )
            // InternalJavaSFT.g:3115:4: (lv_varNameRight2_5_0= RULE_ID )
            {
            // InternalJavaSFT.g:3115:4: (lv_varNameRight2_5_0= RULE_ID )
            // InternalJavaSFT.g:3116:5: lv_varNameRight2_5_0= RULE_ID
            {
            lv_varNameRight2_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_varNameRight2_5_0, grammarAccess.getSumBinaireValValAccess().getVarNameRight2IDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSumBinaireValValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameRight2",
            						lv_varNameRight2_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumBinaireValVal"


    // $ANTLR start "entryRuleProductBinaire"
    // InternalJavaSFT.g:3136:1: entryRuleProductBinaire returns [EObject current=null] : iv_ruleProductBinaire= ruleProductBinaire EOF ;
    public final EObject entryRuleProductBinaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductBinaire = null;


        try {
            // InternalJavaSFT.g:3136:55: (iv_ruleProductBinaire= ruleProductBinaire EOF )
            // InternalJavaSFT.g:3137:2: iv_ruleProductBinaire= ruleProductBinaire EOF
            {
             newCompositeNode(grammarAccess.getProductBinaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductBinaire=ruleProductBinaire();

            state._fsp--;

             current =iv_ruleProductBinaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductBinaire"


    // $ANTLR start "ruleProductBinaire"
    // InternalJavaSFT.g:3143:1: ruleProductBinaire returns [EObject current=null] : (this_ProductBinaireListVal_0= ruleProductBinaireListVal | this_ProductBinaireListList_1= ruleProductBinaireListList | this_ProductBinaireValVal_2= ruleProductBinaireValVal ) ;
    public final EObject ruleProductBinaire() throws RecognitionException {
        EObject current = null;

        EObject this_ProductBinaireListVal_0 = null;

        EObject this_ProductBinaireListList_1 = null;

        EObject this_ProductBinaireValVal_2 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:3149:2: ( (this_ProductBinaireListVal_0= ruleProductBinaireListVal | this_ProductBinaireListList_1= ruleProductBinaireListList | this_ProductBinaireValVal_2= ruleProductBinaireValVal ) )
            // InternalJavaSFT.g:3150:2: (this_ProductBinaireListVal_0= ruleProductBinaireListVal | this_ProductBinaireListList_1= ruleProductBinaireListList | this_ProductBinaireValVal_2= ruleProductBinaireValVal )
            {
            // InternalJavaSFT.g:3150:2: (this_ProductBinaireListVal_0= ruleProductBinaireListVal | this_ProductBinaireListList_1= ruleProductBinaireListList | this_ProductBinaireValVal_2= ruleProductBinaireValVal )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalJavaSFT.g:3151:3: this_ProductBinaireListVal_0= ruleProductBinaireListVal
                    {

                    			newCompositeNode(grammarAccess.getProductBinaireAccess().getProductBinaireListValParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProductBinaireListVal_0=ruleProductBinaireListVal();

                    state._fsp--;


                    			current = this_ProductBinaireListVal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:3160:3: this_ProductBinaireListList_1= ruleProductBinaireListList
                    {

                    			newCompositeNode(grammarAccess.getProductBinaireAccess().getProductBinaireListListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProductBinaireListList_1=ruleProductBinaireListList();

                    state._fsp--;


                    			current = this_ProductBinaireListList_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJavaSFT.g:3169:3: this_ProductBinaireValVal_2= ruleProductBinaireValVal
                    {

                    			newCompositeNode(grammarAccess.getProductBinaireAccess().getProductBinaireValValParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ProductBinaireValVal_2=ruleProductBinaireValVal();

                    state._fsp--;


                    			current = this_ProductBinaireValVal_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductBinaire"


    // $ANTLR start "entryRuleProductBinaireListVal"
    // InternalJavaSFT.g:3181:1: entryRuleProductBinaireListVal returns [EObject current=null] : iv_ruleProductBinaireListVal= ruleProductBinaireListVal EOF ;
    public final EObject entryRuleProductBinaireListVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductBinaireListVal = null;


        try {
            // InternalJavaSFT.g:3181:62: (iv_ruleProductBinaireListVal= ruleProductBinaireListVal EOF )
            // InternalJavaSFT.g:3182:2: iv_ruleProductBinaireListVal= ruleProductBinaireListVal EOF
            {
             newCompositeNode(grammarAccess.getProductBinaireListValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductBinaireListVal=ruleProductBinaireListVal();

            state._fsp--;

             current =iv_ruleProductBinaireListVal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductBinaireListVal"


    // $ANTLR start "ruleProductBinaireListVal"
    // InternalJavaSFT.g:3188:1: ruleProductBinaireListVal returns [EObject current=null] : ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->e*' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ').collect(Collectors.toList());' ) ;
    public final EObject ruleProductBinaireListVal() throws RecognitionException {
        EObject current = null;

        Token lv_listNameLeft_1_0=null;
        Token otherlv_2=null;
        Token lv_listNameRight_4_0=null;
        Token otherlv_5=null;
        Token lv_valNameRight_6_0=null;
        Token otherlv_7=null;
        EObject lv_typeListLeft_0_0 = null;

        EObject lv_typeListRight_3_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:3194:2: ( ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->e*' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ').collect(Collectors.toList());' ) )
            // InternalJavaSFT.g:3195:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->e*' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ').collect(Collectors.toList());' )
            {
            // InternalJavaSFT.g:3195:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->e*' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ').collect(Collectors.toList());' )
            // InternalJavaSFT.g:3196:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->e*' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ').collect(Collectors.toList());'
            {
            // InternalJavaSFT.g:3196:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:3197:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:3197:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            // InternalJavaSFT.g:3198:5: lv_typeListLeft_0_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getProductBinaireListValAccess().getTypeListLeftTypeListNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListLeft_0_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductBinaireListValRule());
            					}
            					set(
            						current,
            						"typeListLeft",
            						lv_typeListLeft_0_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:3215:3: ( (lv_listNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:3216:4: (lv_listNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:3216:4: (lv_listNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:3217:5: lv_listNameLeft_1_0= RULE_ID
            {
            lv_listNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_listNameLeft_1_0, grammarAccess.getProductBinaireListValAccess().getListNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductBinaireListValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameLeft",
            						lv_listNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getProductBinaireListValAccess().getEqualsSignKeyword_2());
            		
            // InternalJavaSFT.g:3237:3: ( (lv_typeListRight_3_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:3238:4: (lv_typeListRight_3_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:3238:4: (lv_typeListRight_3_0= ruleTypeListNumber )
            // InternalJavaSFT.g:3239:5: lv_typeListRight_3_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getProductBinaireListValAccess().getTypeListRightTypeListNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListRight_3_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductBinaireListValRule());
            					}
            					set(
            						current,
            						"typeListRight",
            						lv_typeListRight_3_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:3256:3: ( (lv_listNameRight_4_0= RULE_ID ) )
            // InternalJavaSFT.g:3257:4: (lv_listNameRight_4_0= RULE_ID )
            {
            // InternalJavaSFT.g:3257:4: (lv_listNameRight_4_0= RULE_ID )
            // InternalJavaSFT.g:3258:5: lv_listNameRight_4_0= RULE_ID
            {
            lv_listNameRight_4_0=(Token)match(input,RULE_ID,FOLLOW_57); 

            					newLeafNode(lv_listNameRight_4_0, grammarAccess.getProductBinaireListValAccess().getListNameRightIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductBinaireListValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,64,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getProductBinaireListValAccess().getStreamMapEEKeyword_5());
            		
            // InternalJavaSFT.g:3278:3: ( (lv_valNameRight_6_0= RULE_ID ) )
            // InternalJavaSFT.g:3279:4: (lv_valNameRight_6_0= RULE_ID )
            {
            // InternalJavaSFT.g:3279:4: (lv_valNameRight_6_0= RULE_ID )
            // InternalJavaSFT.g:3280:5: lv_valNameRight_6_0= RULE_ID
            {
            lv_valNameRight_6_0=(Token)match(input,RULE_ID,FOLLOW_51); 

            					newLeafNode(lv_valNameRight_6_0, grammarAccess.getProductBinaireListValAccess().getValNameRightIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductBinaireListValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valNameRight",
            						lv_valNameRight_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getProductBinaireListValAccess().getCollectCollectorsToListKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductBinaireListVal"


    // $ANTLR start "entryRuleProductBinaireListList"
    // InternalJavaSFT.g:3304:1: entryRuleProductBinaireListList returns [EObject current=null] : iv_ruleProductBinaireListList= ruleProductBinaireListList EOF ;
    public final EObject entryRuleProductBinaireListList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductBinaireListList = null;


        try {
            // InternalJavaSFT.g:3304:63: (iv_ruleProductBinaireListList= ruleProductBinaireListList EOF )
            // InternalJavaSFT.g:3305:2: iv_ruleProductBinaireListList= ruleProductBinaireListList EOF
            {
             newCompositeNode(grammarAccess.getProductBinaireListListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductBinaireListList=ruleProductBinaireListList();

            state._fsp--;

             current =iv_ruleProductBinaireListList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductBinaireListList"


    // $ANTLR start "ruleProductBinaireListList"
    // InternalJavaSFT.g:3311:1: ruleProductBinaireListList returns [EObject current=null] : ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i)*' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i)).collect(Collectors.toList());' ) ;
    public final EObject ruleProductBinaireListList() throws RecognitionException {
        EObject current = null;

        Token lv_listNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_SIZEVAR_7=null;
        Token otherlv_8=null;
        Token lv_listNameRight_9_0=null;
        Token otherlv_10=null;
        Token lv_listNameRight2_11_0=null;
        Token otherlv_12=null;
        EObject lv_typeListLeft_0_0 = null;

        EObject lv_typeListRight_4_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:3317:2: ( ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i)*' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i)).collect(Collectors.toList());' ) )
            // InternalJavaSFT.g:3318:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i)*' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i)).collect(Collectors.toList());' )
            {
            // InternalJavaSFT.g:3318:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i)*' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i)).collect(Collectors.toList());' )
            // InternalJavaSFT.g:3319:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i)*' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i)).collect(Collectors.toList());'
            {
            // InternalJavaSFT.g:3319:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:3320:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:3320:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            // InternalJavaSFT.g:3321:5: lv_typeListLeft_0_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getProductBinaireListListAccess().getTypeListLeftTypeListNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListLeft_0_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductBinaireListListRule());
            					}
            					set(
            						current,
            						"typeListLeft",
            						lv_typeListLeft_0_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:3338:3: ( (lv_listNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:3339:4: (lv_listNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:3339:4: (lv_listNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:3340:5: lv_listNameLeft_1_0= RULE_ID
            {
            lv_listNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_listNameLeft_1_0, grammarAccess.getProductBinaireListListAccess().getListNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductBinaireListListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameLeft",
            						lv_listNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getProductBinaireListListAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getProductBinaireListListAccess().getLeftParenthesisKeyword_3());
            		
            // InternalJavaSFT.g:3364:3: ( (lv_typeListRight_4_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:3365:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:3365:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            // InternalJavaSFT.g:3366:5: lv_typeListRight_4_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getProductBinaireListListAccess().getTypeListRightTypeListNumberParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_typeListRight_4_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductBinaireListListRule());
            					}
            					set(
            						current,
            						"typeListRight",
            						lv_typeListRight_4_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_52); 

            			newLeafNode(otherlv_5, grammarAccess.getProductBinaireListListAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,59,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getProductBinaireListListAccess().getIntStreamRange0Keyword_6());
            		
            this_SIZEVAR_7=(Token)match(input,RULE_SIZEVAR,FOLLOW_53); 

            			newLeafNode(this_SIZEVAR_7, grammarAccess.getProductBinaireListListAccess().getSIZEVARTerminalRuleCall_7());
            		
            otherlv_8=(Token)match(input,60,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getProductBinaireListListAccess().getMapToObjIKeyword_8());
            		
            // InternalJavaSFT.g:3399:3: ( (lv_listNameRight_9_0= RULE_ID ) )
            // InternalJavaSFT.g:3400:4: (lv_listNameRight_9_0= RULE_ID )
            {
            // InternalJavaSFT.g:3400:4: (lv_listNameRight_9_0= RULE_ID )
            // InternalJavaSFT.g:3401:5: lv_listNameRight_9_0= RULE_ID
            {
            lv_listNameRight_9_0=(Token)match(input,RULE_ID,FOLLOW_58); 

            					newLeafNode(lv_listNameRight_9_0, grammarAccess.getProductBinaireListListAccess().getListNameRightIDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductBinaireListListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_9_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_10=(Token)match(input,65,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getProductBinaireListListAccess().getGetIKeyword_10());
            		
            // InternalJavaSFT.g:3421:3: ( (lv_listNameRight2_11_0= RULE_ID ) )
            // InternalJavaSFT.g:3422:4: (lv_listNameRight2_11_0= RULE_ID )
            {
            // InternalJavaSFT.g:3422:4: (lv_listNameRight2_11_0= RULE_ID )
            // InternalJavaSFT.g:3423:5: lv_listNameRight2_11_0= RULE_ID
            {
            lv_listNameRight2_11_0=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(lv_listNameRight2_11_0, grammarAccess.getProductBinaireListListAccess().getListNameRight2IDTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductBinaireListListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight2",
            						lv_listNameRight2_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_12=(Token)match(input,62,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getProductBinaireListListAccess().getGetICollectCollectorsToListKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductBinaireListList"


    // $ANTLR start "entryRuleProductBinaireValVal"
    // InternalJavaSFT.g:3447:1: entryRuleProductBinaireValVal returns [EObject current=null] : iv_ruleProductBinaireValVal= ruleProductBinaireValVal EOF ;
    public final EObject entryRuleProductBinaireValVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductBinaireValVal = null;


        try {
            // InternalJavaSFT.g:3447:61: (iv_ruleProductBinaireValVal= ruleProductBinaireValVal EOF )
            // InternalJavaSFT.g:3448:2: iv_ruleProductBinaireValVal= ruleProductBinaireValVal EOF
            {
             newCompositeNode(grammarAccess.getProductBinaireValValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProductBinaireValVal=ruleProductBinaireValVal();

            state._fsp--;

             current =iv_ruleProductBinaireValVal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductBinaireValVal"


    // $ANTLR start "ruleProductBinaireValVal"
    // InternalJavaSFT.g:3454:1: ruleProductBinaireValVal returns [EObject current=null] : ( ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_varNameRight1_3_0= RULE_ID ) ) otherlv_4= '*' ( (lv_varNameRight2_5_0= RULE_ID ) ) ) ;
    public final EObject ruleProductBinaireValVal() throws RecognitionException {
        EObject current = null;

        Token lv_varNameLeft_1_0=null;
        Token otherlv_2=null;
        Token lv_varNameRight1_3_0=null;
        Token otherlv_4=null;
        Token lv_varNameRight2_5_0=null;
        AntlrDatatypeRuleToken lv_typeVarLeft_0_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:3460:2: ( ( ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_varNameRight1_3_0= RULE_ID ) ) otherlv_4= '*' ( (lv_varNameRight2_5_0= RULE_ID ) ) ) )
            // InternalJavaSFT.g:3461:2: ( ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_varNameRight1_3_0= RULE_ID ) ) otherlv_4= '*' ( (lv_varNameRight2_5_0= RULE_ID ) ) )
            {
            // InternalJavaSFT.g:3461:2: ( ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_varNameRight1_3_0= RULE_ID ) ) otherlv_4= '*' ( (lv_varNameRight2_5_0= RULE_ID ) ) )
            // InternalJavaSFT.g:3462:3: ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_varNameRight1_3_0= RULE_ID ) ) otherlv_4= '*' ( (lv_varNameRight2_5_0= RULE_ID ) )
            {
            // InternalJavaSFT.g:3462:3: ( (lv_typeVarLeft_0_0= ruleTypeNumber ) )
            // InternalJavaSFT.g:3463:4: (lv_typeVarLeft_0_0= ruleTypeNumber )
            {
            // InternalJavaSFT.g:3463:4: (lv_typeVarLeft_0_0= ruleTypeNumber )
            // InternalJavaSFT.g:3464:5: lv_typeVarLeft_0_0= ruleTypeNumber
            {

            					newCompositeNode(grammarAccess.getProductBinaireValValAccess().getTypeVarLeftTypeNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeVarLeft_0_0=ruleTypeNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProductBinaireValValRule());
            					}
            					set(
            						current,
            						"typeVarLeft",
            						lv_typeVarLeft_0_0,
            						"projetIDM.JavaSFT.TypeNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:3481:3: ( (lv_varNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:3482:4: (lv_varNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:3482:4: (lv_varNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:3483:5: lv_varNameLeft_1_0= RULE_ID
            {
            lv_varNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_varNameLeft_1_0, grammarAccess.getProductBinaireValValAccess().getVarNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductBinaireValValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameLeft",
            						lv_varNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getProductBinaireValValAccess().getEqualsSignKeyword_2());
            		
            // InternalJavaSFT.g:3503:3: ( (lv_varNameRight1_3_0= RULE_ID ) )
            // InternalJavaSFT.g:3504:4: (lv_varNameRight1_3_0= RULE_ID )
            {
            // InternalJavaSFT.g:3504:4: (lv_varNameRight1_3_0= RULE_ID )
            // InternalJavaSFT.g:3505:5: lv_varNameRight1_3_0= RULE_ID
            {
            lv_varNameRight1_3_0=(Token)match(input,RULE_ID,FOLLOW_59); 

            					newLeafNode(lv_varNameRight1_3_0, grammarAccess.getProductBinaireValValAccess().getVarNameRight1IDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductBinaireValValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameRight1",
            						lv_varNameRight1_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,66,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getProductBinaireValValAccess().getAsteriskKeyword_4());
            		
            // InternalJavaSFT.g:3525:3: ( (lv_varNameRight2_5_0= RULE_ID ) )
            // InternalJavaSFT.g:3526:4: (lv_varNameRight2_5_0= RULE_ID )
            {
            // InternalJavaSFT.g:3526:4: (lv_varNameRight2_5_0= RULE_ID )
            // InternalJavaSFT.g:3527:5: lv_varNameRight2_5_0= RULE_ID
            {
            lv_varNameRight2_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_varNameRight2_5_0, grammarAccess.getProductBinaireValValAccess().getVarNameRight2IDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProductBinaireValValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameRight2",
            						lv_varNameRight2_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductBinaireValVal"


    // $ANTLR start "entryRuleDivisionBinaire"
    // InternalJavaSFT.g:3547:1: entryRuleDivisionBinaire returns [EObject current=null] : iv_ruleDivisionBinaire= ruleDivisionBinaire EOF ;
    public final EObject entryRuleDivisionBinaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionBinaire = null;


        try {
            // InternalJavaSFT.g:3547:56: (iv_ruleDivisionBinaire= ruleDivisionBinaire EOF )
            // InternalJavaSFT.g:3548:2: iv_ruleDivisionBinaire= ruleDivisionBinaire EOF
            {
             newCompositeNode(grammarAccess.getDivisionBinaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivisionBinaire=ruleDivisionBinaire();

            state._fsp--;

             current =iv_ruleDivisionBinaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivisionBinaire"


    // $ANTLR start "ruleDivisionBinaire"
    // InternalJavaSFT.g:3554:1: ruleDivisionBinaire returns [EObject current=null] : (this_DivisionBinaireListVal_0= ruleDivisionBinaireListVal | this_DivisionBinaireValList_1= ruleDivisionBinaireValList | this_DivisionBinaireListList_2= ruleDivisionBinaireListList | this_DivisionBinaireValVal_3= ruleDivisionBinaireValVal ) ;
    public final EObject ruleDivisionBinaire() throws RecognitionException {
        EObject current = null;

        EObject this_DivisionBinaireListVal_0 = null;

        EObject this_DivisionBinaireValList_1 = null;

        EObject this_DivisionBinaireListList_2 = null;

        EObject this_DivisionBinaireValVal_3 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:3560:2: ( (this_DivisionBinaireListVal_0= ruleDivisionBinaireListVal | this_DivisionBinaireValList_1= ruleDivisionBinaireValList | this_DivisionBinaireListList_2= ruleDivisionBinaireListList | this_DivisionBinaireValVal_3= ruleDivisionBinaireValVal ) )
            // InternalJavaSFT.g:3561:2: (this_DivisionBinaireListVal_0= ruleDivisionBinaireListVal | this_DivisionBinaireValList_1= ruleDivisionBinaireValList | this_DivisionBinaireListList_2= ruleDivisionBinaireListList | this_DivisionBinaireValVal_3= ruleDivisionBinaireValVal )
            {
            // InternalJavaSFT.g:3561:2: (this_DivisionBinaireListVal_0= ruleDivisionBinaireListVal | this_DivisionBinaireValList_1= ruleDivisionBinaireValList | this_DivisionBinaireListList_2= ruleDivisionBinaireListList | this_DivisionBinaireValVal_3= ruleDivisionBinaireValVal )
            int alt18=4;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalJavaSFT.g:3562:3: this_DivisionBinaireListVal_0= ruleDivisionBinaireListVal
                    {

                    			newCompositeNode(grammarAccess.getDivisionBinaireAccess().getDivisionBinaireListValParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DivisionBinaireListVal_0=ruleDivisionBinaireListVal();

                    state._fsp--;


                    			current = this_DivisionBinaireListVal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:3571:3: this_DivisionBinaireValList_1= ruleDivisionBinaireValList
                    {

                    			newCompositeNode(grammarAccess.getDivisionBinaireAccess().getDivisionBinaireValListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DivisionBinaireValList_1=ruleDivisionBinaireValList();

                    state._fsp--;


                    			current = this_DivisionBinaireValList_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJavaSFT.g:3580:3: this_DivisionBinaireListList_2= ruleDivisionBinaireListList
                    {

                    			newCompositeNode(grammarAccess.getDivisionBinaireAccess().getDivisionBinaireListListParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DivisionBinaireListList_2=ruleDivisionBinaireListList();

                    state._fsp--;


                    			current = this_DivisionBinaireListList_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJavaSFT.g:3589:3: this_DivisionBinaireValVal_3= ruleDivisionBinaireValVal
                    {

                    			newCompositeNode(grammarAccess.getDivisionBinaireAccess().getDivisionBinaireValValParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DivisionBinaireValVal_3=ruleDivisionBinaireValVal();

                    state._fsp--;


                    			current = this_DivisionBinaireValVal_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivisionBinaire"


    // $ANTLR start "entryRuleDivisionBinaireListVal"
    // InternalJavaSFT.g:3601:1: entryRuleDivisionBinaireListVal returns [EObject current=null] : iv_ruleDivisionBinaireListVal= ruleDivisionBinaireListVal EOF ;
    public final EObject entryRuleDivisionBinaireListVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionBinaireListVal = null;


        try {
            // InternalJavaSFT.g:3601:63: (iv_ruleDivisionBinaireListVal= ruleDivisionBinaireListVal EOF )
            // InternalJavaSFT.g:3602:2: iv_ruleDivisionBinaireListVal= ruleDivisionBinaireListVal EOF
            {
             newCompositeNode(grammarAccess.getDivisionBinaireListValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivisionBinaireListVal=ruleDivisionBinaireListVal();

            state._fsp--;

             current =iv_ruleDivisionBinaireListVal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivisionBinaireListVal"


    // $ANTLR start "ruleDivisionBinaireListVal"
    // InternalJavaSFT.g:3608:1: ruleDivisionBinaireListVal returns [EObject current=null] : ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->e/' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ').collect(Collectors.toList());' ) ;
    public final EObject ruleDivisionBinaireListVal() throws RecognitionException {
        EObject current = null;

        Token lv_listNameLeft_1_0=null;
        Token otherlv_2=null;
        Token lv_listNameRight_4_0=null;
        Token otherlv_5=null;
        Token lv_valNameRight_6_0=null;
        Token otherlv_7=null;
        EObject lv_typeListLeft_0_0 = null;

        EObject lv_typeListRight_3_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:3614:2: ( ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->e/' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ').collect(Collectors.toList());' ) )
            // InternalJavaSFT.g:3615:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->e/' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ').collect(Collectors.toList());' )
            {
            // InternalJavaSFT.g:3615:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->e/' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ').collect(Collectors.toList());' )
            // InternalJavaSFT.g:3616:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->e/' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ').collect(Collectors.toList());'
            {
            // InternalJavaSFT.g:3616:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:3617:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:3617:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            // InternalJavaSFT.g:3618:5: lv_typeListLeft_0_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getDivisionBinaireListValAccess().getTypeListLeftTypeListNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListLeft_0_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivisionBinaireListValRule());
            					}
            					set(
            						current,
            						"typeListLeft",
            						lv_typeListLeft_0_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:3635:3: ( (lv_listNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:3636:4: (lv_listNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:3636:4: (lv_listNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:3637:5: lv_listNameLeft_1_0= RULE_ID
            {
            lv_listNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_listNameLeft_1_0, grammarAccess.getDivisionBinaireListValAccess().getListNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDivisionBinaireListValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameLeft",
            						lv_listNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getDivisionBinaireListValAccess().getEqualsSignKeyword_2());
            		
            // InternalJavaSFT.g:3657:3: ( (lv_typeListRight_3_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:3658:4: (lv_typeListRight_3_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:3658:4: (lv_typeListRight_3_0= ruleTypeListNumber )
            // InternalJavaSFT.g:3659:5: lv_typeListRight_3_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getDivisionBinaireListValAccess().getTypeListRightTypeListNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListRight_3_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivisionBinaireListValRule());
            					}
            					set(
            						current,
            						"typeListRight",
            						lv_typeListRight_3_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:3676:3: ( (lv_listNameRight_4_0= RULE_ID ) )
            // InternalJavaSFT.g:3677:4: (lv_listNameRight_4_0= RULE_ID )
            {
            // InternalJavaSFT.g:3677:4: (lv_listNameRight_4_0= RULE_ID )
            // InternalJavaSFT.g:3678:5: lv_listNameRight_4_0= RULE_ID
            {
            lv_listNameRight_4_0=(Token)match(input,RULE_ID,FOLLOW_60); 

            					newLeafNode(lv_listNameRight_4_0, grammarAccess.getDivisionBinaireListValAccess().getListNameRightIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDivisionBinaireListValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,67,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getDivisionBinaireListValAccess().getStreamMapEEKeyword_5());
            		
            // InternalJavaSFT.g:3698:3: ( (lv_valNameRight_6_0= RULE_ID ) )
            // InternalJavaSFT.g:3699:4: (lv_valNameRight_6_0= RULE_ID )
            {
            // InternalJavaSFT.g:3699:4: (lv_valNameRight_6_0= RULE_ID )
            // InternalJavaSFT.g:3700:5: lv_valNameRight_6_0= RULE_ID
            {
            lv_valNameRight_6_0=(Token)match(input,RULE_ID,FOLLOW_51); 

            					newLeafNode(lv_valNameRight_6_0, grammarAccess.getDivisionBinaireListValAccess().getValNameRightIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDivisionBinaireListValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valNameRight",
            						lv_valNameRight_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDivisionBinaireListValAccess().getCollectCollectorsToListKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivisionBinaireListVal"


    // $ANTLR start "entryRuleDivisionBinaireValList"
    // InternalJavaSFT.g:3724:1: entryRuleDivisionBinaireValList returns [EObject current=null] : iv_ruleDivisionBinaireValList= ruleDivisionBinaireValList EOF ;
    public final EObject entryRuleDivisionBinaireValList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionBinaireValList = null;


        try {
            // InternalJavaSFT.g:3724:63: (iv_ruleDivisionBinaireValList= ruleDivisionBinaireValList EOF )
            // InternalJavaSFT.g:3725:2: iv_ruleDivisionBinaireValList= ruleDivisionBinaireValList EOF
            {
             newCompositeNode(grammarAccess.getDivisionBinaireValListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivisionBinaireValList=ruleDivisionBinaireValList();

            state._fsp--;

             current =iv_ruleDivisionBinaireValList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivisionBinaireValList"


    // $ANTLR start "ruleDivisionBinaireValList"
    // InternalJavaSFT.g:3731:1: ruleDivisionBinaireValList returns [EObject current=null] : ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= '/e).collect(Collectors.toList());' ) ;
    public final EObject ruleDivisionBinaireValList() throws RecognitionException {
        EObject current = null;

        Token lv_listNameLeft_1_0=null;
        Token otherlv_2=null;
        Token lv_listNameRight_4_0=null;
        Token otherlv_5=null;
        Token lv_valNameRight_6_0=null;
        Token otherlv_7=null;
        EObject lv_typeListLeft_0_0 = null;

        EObject lv_typeListRight_3_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:3737:2: ( ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= '/e).collect(Collectors.toList());' ) )
            // InternalJavaSFT.g:3738:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= '/e).collect(Collectors.toList());' )
            {
            // InternalJavaSFT.g:3738:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= '/e).collect(Collectors.toList());' )
            // InternalJavaSFT.g:3739:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= '/e).collect(Collectors.toList());'
            {
            // InternalJavaSFT.g:3739:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:3740:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:3740:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            // InternalJavaSFT.g:3741:5: lv_typeListLeft_0_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getDivisionBinaireValListAccess().getTypeListLeftTypeListNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListLeft_0_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivisionBinaireValListRule());
            					}
            					set(
            						current,
            						"typeListLeft",
            						lv_typeListLeft_0_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:3758:3: ( (lv_listNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:3759:4: (lv_listNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:3759:4: (lv_listNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:3760:5: lv_listNameLeft_1_0= RULE_ID
            {
            lv_listNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_listNameLeft_1_0, grammarAccess.getDivisionBinaireValListAccess().getListNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDivisionBinaireValListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameLeft",
            						lv_listNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getDivisionBinaireValListAccess().getEqualsSignKeyword_2());
            		
            // InternalJavaSFT.g:3780:3: ( (lv_typeListRight_3_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:3781:4: (lv_typeListRight_3_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:3781:4: (lv_typeListRight_3_0= ruleTypeListNumber )
            // InternalJavaSFT.g:3782:5: lv_typeListRight_3_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getDivisionBinaireValListAccess().getTypeListRightTypeListNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListRight_3_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivisionBinaireValListRule());
            					}
            					set(
            						current,
            						"typeListRight",
            						lv_typeListRight_3_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:3799:3: ( (lv_listNameRight_4_0= RULE_ID ) )
            // InternalJavaSFT.g:3800:4: (lv_listNameRight_4_0= RULE_ID )
            {
            // InternalJavaSFT.g:3800:4: (lv_listNameRight_4_0= RULE_ID )
            // InternalJavaSFT.g:3801:5: lv_listNameRight_4_0= RULE_ID
            {
            lv_listNameRight_4_0=(Token)match(input,RULE_ID,FOLLOW_61); 

            					newLeafNode(lv_listNameRight_4_0, grammarAccess.getDivisionBinaireValListAccess().getListNameRightIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDivisionBinaireValListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,68,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getDivisionBinaireValListAccess().getStreamMapEKeyword_5());
            		
            // InternalJavaSFT.g:3821:3: ( (lv_valNameRight_6_0= RULE_ID ) )
            // InternalJavaSFT.g:3822:4: (lv_valNameRight_6_0= RULE_ID )
            {
            // InternalJavaSFT.g:3822:4: (lv_valNameRight_6_0= RULE_ID )
            // InternalJavaSFT.g:3823:5: lv_valNameRight_6_0= RULE_ID
            {
            lv_valNameRight_6_0=(Token)match(input,RULE_ID,FOLLOW_62); 

            					newLeafNode(lv_valNameRight_6_0, grammarAccess.getDivisionBinaireValListAccess().getValNameRightIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDivisionBinaireValListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valNameRight",
            						lv_valNameRight_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,69,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDivisionBinaireValListAccess().getECollectCollectorsToListKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivisionBinaireValList"


    // $ANTLR start "entryRuleDivisionBinaireListList"
    // InternalJavaSFT.g:3847:1: entryRuleDivisionBinaireListList returns [EObject current=null] : iv_ruleDivisionBinaireListList= ruleDivisionBinaireListList EOF ;
    public final EObject entryRuleDivisionBinaireListList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionBinaireListList = null;


        try {
            // InternalJavaSFT.g:3847:64: (iv_ruleDivisionBinaireListList= ruleDivisionBinaireListList EOF )
            // InternalJavaSFT.g:3848:2: iv_ruleDivisionBinaireListList= ruleDivisionBinaireListList EOF
            {
             newCompositeNode(grammarAccess.getDivisionBinaireListListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivisionBinaireListList=ruleDivisionBinaireListList();

            state._fsp--;

             current =iv_ruleDivisionBinaireListList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivisionBinaireListList"


    // $ANTLR start "ruleDivisionBinaireListList"
    // InternalJavaSFT.g:3854:1: ruleDivisionBinaireListList returns [EObject current=null] : ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i)/' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i)).collect(Collectors.toList());' ) ;
    public final EObject ruleDivisionBinaireListList() throws RecognitionException {
        EObject current = null;

        Token lv_listNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_SIZEVAR_7=null;
        Token otherlv_8=null;
        Token lv_listNameRight_9_0=null;
        Token otherlv_10=null;
        Token lv_listNameRight2_11_0=null;
        Token otherlv_12=null;
        EObject lv_typeListLeft_0_0 = null;

        EObject lv_typeListRight_4_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:3860:2: ( ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i)/' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i)).collect(Collectors.toList());' ) )
            // InternalJavaSFT.g:3861:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i)/' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i)).collect(Collectors.toList());' )
            {
            // InternalJavaSFT.g:3861:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i)/' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i)).collect(Collectors.toList());' )
            // InternalJavaSFT.g:3862:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i)/' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i)).collect(Collectors.toList());'
            {
            // InternalJavaSFT.g:3862:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:3863:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:3863:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            // InternalJavaSFT.g:3864:5: lv_typeListLeft_0_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getDivisionBinaireListListAccess().getTypeListLeftTypeListNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListLeft_0_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivisionBinaireListListRule());
            					}
            					set(
            						current,
            						"typeListLeft",
            						lv_typeListLeft_0_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:3881:3: ( (lv_listNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:3882:4: (lv_listNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:3882:4: (lv_listNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:3883:5: lv_listNameLeft_1_0= RULE_ID
            {
            lv_listNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_listNameLeft_1_0, grammarAccess.getDivisionBinaireListListAccess().getListNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDivisionBinaireListListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameLeft",
            						lv_listNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getDivisionBinaireListListAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getDivisionBinaireListListAccess().getLeftParenthesisKeyword_3());
            		
            // InternalJavaSFT.g:3907:3: ( (lv_typeListRight_4_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:3908:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:3908:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            // InternalJavaSFT.g:3909:5: lv_typeListRight_4_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getDivisionBinaireListListAccess().getTypeListRightTypeListNumberParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_typeListRight_4_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivisionBinaireListListRule());
            					}
            					set(
            						current,
            						"typeListRight",
            						lv_typeListRight_4_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_52); 

            			newLeafNode(otherlv_5, grammarAccess.getDivisionBinaireListListAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,59,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getDivisionBinaireListListAccess().getIntStreamRange0Keyword_6());
            		
            this_SIZEVAR_7=(Token)match(input,RULE_SIZEVAR,FOLLOW_53); 

            			newLeafNode(this_SIZEVAR_7, grammarAccess.getDivisionBinaireListListAccess().getSIZEVARTerminalRuleCall_7());
            		
            otherlv_8=(Token)match(input,60,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getDivisionBinaireListListAccess().getMapToObjIKeyword_8());
            		
            // InternalJavaSFT.g:3942:3: ( (lv_listNameRight_9_0= RULE_ID ) )
            // InternalJavaSFT.g:3943:4: (lv_listNameRight_9_0= RULE_ID )
            {
            // InternalJavaSFT.g:3943:4: (lv_listNameRight_9_0= RULE_ID )
            // InternalJavaSFT.g:3944:5: lv_listNameRight_9_0= RULE_ID
            {
            lv_listNameRight_9_0=(Token)match(input,RULE_ID,FOLLOW_63); 

            					newLeafNode(lv_listNameRight_9_0, grammarAccess.getDivisionBinaireListListAccess().getListNameRightIDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDivisionBinaireListListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_9_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_10=(Token)match(input,70,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getDivisionBinaireListListAccess().getGetIKeyword_10());
            		
            // InternalJavaSFT.g:3964:3: ( (lv_listNameRight2_11_0= RULE_ID ) )
            // InternalJavaSFT.g:3965:4: (lv_listNameRight2_11_0= RULE_ID )
            {
            // InternalJavaSFT.g:3965:4: (lv_listNameRight2_11_0= RULE_ID )
            // InternalJavaSFT.g:3966:5: lv_listNameRight2_11_0= RULE_ID
            {
            lv_listNameRight2_11_0=(Token)match(input,RULE_ID,FOLLOW_55); 

            					newLeafNode(lv_listNameRight2_11_0, grammarAccess.getDivisionBinaireListListAccess().getListNameRight2IDTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDivisionBinaireListListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight2",
            						lv_listNameRight2_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_12=(Token)match(input,62,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDivisionBinaireListListAccess().getGetICollectCollectorsToListKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivisionBinaireListList"


    // $ANTLR start "entryRuleDivisionBinaireValVal"
    // InternalJavaSFT.g:3990:1: entryRuleDivisionBinaireValVal returns [EObject current=null] : iv_ruleDivisionBinaireValVal= ruleDivisionBinaireValVal EOF ;
    public final EObject entryRuleDivisionBinaireValVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionBinaireValVal = null;


        try {
            // InternalJavaSFT.g:3990:62: (iv_ruleDivisionBinaireValVal= ruleDivisionBinaireValVal EOF )
            // InternalJavaSFT.g:3991:2: iv_ruleDivisionBinaireValVal= ruleDivisionBinaireValVal EOF
            {
             newCompositeNode(grammarAccess.getDivisionBinaireValValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDivisionBinaireValVal=ruleDivisionBinaireValVal();

            state._fsp--;

             current =iv_ruleDivisionBinaireValVal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDivisionBinaireValVal"


    // $ANTLR start "ruleDivisionBinaireValVal"
    // InternalJavaSFT.g:3997:1: ruleDivisionBinaireValVal returns [EObject current=null] : ( ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_varNameRight1_3_0= RULE_ID ) ) otherlv_4= '/' ( (lv_varNameRight2_5_0= RULE_ID ) ) ) ;
    public final EObject ruleDivisionBinaireValVal() throws RecognitionException {
        EObject current = null;

        Token lv_varNameLeft_1_0=null;
        Token otherlv_2=null;
        Token lv_varNameRight1_3_0=null;
        Token otherlv_4=null;
        Token lv_varNameRight2_5_0=null;
        AntlrDatatypeRuleToken lv_typeVarLeft_0_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:4003:2: ( ( ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_varNameRight1_3_0= RULE_ID ) ) otherlv_4= '/' ( (lv_varNameRight2_5_0= RULE_ID ) ) ) )
            // InternalJavaSFT.g:4004:2: ( ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_varNameRight1_3_0= RULE_ID ) ) otherlv_4= '/' ( (lv_varNameRight2_5_0= RULE_ID ) ) )
            {
            // InternalJavaSFT.g:4004:2: ( ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_varNameRight1_3_0= RULE_ID ) ) otherlv_4= '/' ( (lv_varNameRight2_5_0= RULE_ID ) ) )
            // InternalJavaSFT.g:4005:3: ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_varNameRight1_3_0= RULE_ID ) ) otherlv_4= '/' ( (lv_varNameRight2_5_0= RULE_ID ) )
            {
            // InternalJavaSFT.g:4005:3: ( (lv_typeVarLeft_0_0= ruleTypeNumber ) )
            // InternalJavaSFT.g:4006:4: (lv_typeVarLeft_0_0= ruleTypeNumber )
            {
            // InternalJavaSFT.g:4006:4: (lv_typeVarLeft_0_0= ruleTypeNumber )
            // InternalJavaSFT.g:4007:5: lv_typeVarLeft_0_0= ruleTypeNumber
            {

            					newCompositeNode(grammarAccess.getDivisionBinaireValValAccess().getTypeVarLeftTypeNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeVarLeft_0_0=ruleTypeNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDivisionBinaireValValRule());
            					}
            					set(
            						current,
            						"typeVarLeft",
            						lv_typeVarLeft_0_0,
            						"projetIDM.JavaSFT.TypeNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:4024:3: ( (lv_varNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:4025:4: (lv_varNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:4025:4: (lv_varNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:4026:5: lv_varNameLeft_1_0= RULE_ID
            {
            lv_varNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_varNameLeft_1_0, grammarAccess.getDivisionBinaireValValAccess().getVarNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDivisionBinaireValValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameLeft",
            						lv_varNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getDivisionBinaireValValAccess().getEqualsSignKeyword_2());
            		
            // InternalJavaSFT.g:4046:3: ( (lv_varNameRight1_3_0= RULE_ID ) )
            // InternalJavaSFT.g:4047:4: (lv_varNameRight1_3_0= RULE_ID )
            {
            // InternalJavaSFT.g:4047:4: (lv_varNameRight1_3_0= RULE_ID )
            // InternalJavaSFT.g:4048:5: lv_varNameRight1_3_0= RULE_ID
            {
            lv_varNameRight1_3_0=(Token)match(input,RULE_ID,FOLLOW_64); 

            					newLeafNode(lv_varNameRight1_3_0, grammarAccess.getDivisionBinaireValValAccess().getVarNameRight1IDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDivisionBinaireValValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameRight1",
            						lv_varNameRight1_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,71,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getDivisionBinaireValValAccess().getSolidusKeyword_4());
            		
            // InternalJavaSFT.g:4068:3: ( (lv_varNameRight2_5_0= RULE_ID ) )
            // InternalJavaSFT.g:4069:4: (lv_varNameRight2_5_0= RULE_ID )
            {
            // InternalJavaSFT.g:4069:4: (lv_varNameRight2_5_0= RULE_ID )
            // InternalJavaSFT.g:4070:5: lv_varNameRight2_5_0= RULE_ID
            {
            lv_varNameRight2_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_varNameRight2_5_0, grammarAccess.getDivisionBinaireValValAccess().getVarNameRight2IDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDivisionBinaireValValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameRight2",
            						lv_varNameRight2_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDivisionBinaireValVal"


    // $ANTLR start "entryRuleMinBinaire"
    // InternalJavaSFT.g:4090:1: entryRuleMinBinaire returns [EObject current=null] : iv_ruleMinBinaire= ruleMinBinaire EOF ;
    public final EObject entryRuleMinBinaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinBinaire = null;


        try {
            // InternalJavaSFT.g:4090:51: (iv_ruleMinBinaire= ruleMinBinaire EOF )
            // InternalJavaSFT.g:4091:2: iv_ruleMinBinaire= ruleMinBinaire EOF
            {
             newCompositeNode(grammarAccess.getMinBinaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinBinaire=ruleMinBinaire();

            state._fsp--;

             current =iv_ruleMinBinaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinBinaire"


    // $ANTLR start "ruleMinBinaire"
    // InternalJavaSFT.g:4097:1: ruleMinBinaire returns [EObject current=null] : (this_MinBinaireListVal_0= ruleMinBinaireListVal | this_MinBinaireListList_1= ruleMinBinaireListList | this_MinBinaireValVal_2= ruleMinBinaireValVal ) ;
    public final EObject ruleMinBinaire() throws RecognitionException {
        EObject current = null;

        EObject this_MinBinaireListVal_0 = null;

        EObject this_MinBinaireListList_1 = null;

        EObject this_MinBinaireValVal_2 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:4103:2: ( (this_MinBinaireListVal_0= ruleMinBinaireListVal | this_MinBinaireListList_1= ruleMinBinaireListList | this_MinBinaireValVal_2= ruleMinBinaireValVal ) )
            // InternalJavaSFT.g:4104:2: (this_MinBinaireListVal_0= ruleMinBinaireListVal | this_MinBinaireListList_1= ruleMinBinaireListList | this_MinBinaireValVal_2= ruleMinBinaireValVal )
            {
            // InternalJavaSFT.g:4104:2: (this_MinBinaireListVal_0= ruleMinBinaireListVal | this_MinBinaireListList_1= ruleMinBinaireListList | this_MinBinaireValVal_2= ruleMinBinaireValVal )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalJavaSFT.g:4105:3: this_MinBinaireListVal_0= ruleMinBinaireListVal
                    {

                    			newCompositeNode(grammarAccess.getMinBinaireAccess().getMinBinaireListValParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinBinaireListVal_0=ruleMinBinaireListVal();

                    state._fsp--;


                    			current = this_MinBinaireListVal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:4114:3: this_MinBinaireListList_1= ruleMinBinaireListList
                    {

                    			newCompositeNode(grammarAccess.getMinBinaireAccess().getMinBinaireListListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinBinaireListList_1=ruleMinBinaireListList();

                    state._fsp--;


                    			current = this_MinBinaireListList_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJavaSFT.g:4123:3: this_MinBinaireValVal_2= ruleMinBinaireValVal
                    {

                    			newCompositeNode(grammarAccess.getMinBinaireAccess().getMinBinaireValValParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MinBinaireValVal_2=ruleMinBinaireValVal();

                    state._fsp--;


                    			current = this_MinBinaireValVal_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinBinaire"


    // $ANTLR start "entryRuleMinBinaireListVal"
    // InternalJavaSFT.g:4135:1: entryRuleMinBinaireListVal returns [EObject current=null] : iv_ruleMinBinaireListVal= ruleMinBinaireListVal EOF ;
    public final EObject entryRuleMinBinaireListVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinBinaireListVal = null;


        try {
            // InternalJavaSFT.g:4135:58: (iv_ruleMinBinaireListVal= ruleMinBinaireListVal EOF )
            // InternalJavaSFT.g:4136:2: iv_ruleMinBinaireListVal= ruleMinBinaireListVal EOF
            {
             newCompositeNode(grammarAccess.getMinBinaireListValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinBinaireListVal=ruleMinBinaireListVal();

            state._fsp--;

             current =iv_ruleMinBinaireListVal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinBinaireListVal"


    // $ANTLR start "ruleMinBinaireListVal"
    // InternalJavaSFT.g:4142:1: ruleMinBinaireListVal returns [EObject current=null] : ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->Math.min(e,' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ')).collect(Collectors.toList());' ) ;
    public final EObject ruleMinBinaireListVal() throws RecognitionException {
        EObject current = null;

        Token lv_listNameLeft_1_0=null;
        Token otherlv_2=null;
        Token lv_listNameRight_4_0=null;
        Token otherlv_5=null;
        Token lv_valNameRight_6_0=null;
        Token otherlv_7=null;
        EObject lv_typeListLeft_0_0 = null;

        EObject lv_typeListRight_3_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:4148:2: ( ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->Math.min(e,' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ')).collect(Collectors.toList());' ) )
            // InternalJavaSFT.g:4149:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->Math.min(e,' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ')).collect(Collectors.toList());' )
            {
            // InternalJavaSFT.g:4149:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->Math.min(e,' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ')).collect(Collectors.toList());' )
            // InternalJavaSFT.g:4150:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->Math.min(e,' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ')).collect(Collectors.toList());'
            {
            // InternalJavaSFT.g:4150:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:4151:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:4151:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            // InternalJavaSFT.g:4152:5: lv_typeListLeft_0_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getMinBinaireListValAccess().getTypeListLeftTypeListNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListLeft_0_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinBinaireListValRule());
            					}
            					set(
            						current,
            						"typeListLeft",
            						lv_typeListLeft_0_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:4169:3: ( (lv_listNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:4170:4: (lv_listNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:4170:4: (lv_listNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:4171:5: lv_listNameLeft_1_0= RULE_ID
            {
            lv_listNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_listNameLeft_1_0, grammarAccess.getMinBinaireListValAccess().getListNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinBinaireListValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameLeft",
            						lv_listNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getMinBinaireListValAccess().getEqualsSignKeyword_2());
            		
            // InternalJavaSFT.g:4191:3: ( (lv_typeListRight_3_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:4192:4: (lv_typeListRight_3_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:4192:4: (lv_typeListRight_3_0= ruleTypeListNumber )
            // InternalJavaSFT.g:4193:5: lv_typeListRight_3_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getMinBinaireListValAccess().getTypeListRightTypeListNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListRight_3_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinBinaireListValRule());
            					}
            					set(
            						current,
            						"typeListRight",
            						lv_typeListRight_3_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:4210:3: ( (lv_listNameRight_4_0= RULE_ID ) )
            // InternalJavaSFT.g:4211:4: (lv_listNameRight_4_0= RULE_ID )
            {
            // InternalJavaSFT.g:4211:4: (lv_listNameRight_4_0= RULE_ID )
            // InternalJavaSFT.g:4212:5: lv_listNameRight_4_0= RULE_ID
            {
            lv_listNameRight_4_0=(Token)match(input,RULE_ID,FOLLOW_65); 

            					newLeafNode(lv_listNameRight_4_0, grammarAccess.getMinBinaireListValAccess().getListNameRightIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinBinaireListValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,72,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getMinBinaireListValAccess().getStreamMapEMathMinEKeyword_5());
            		
            // InternalJavaSFT.g:4232:3: ( (lv_valNameRight_6_0= RULE_ID ) )
            // InternalJavaSFT.g:4233:4: (lv_valNameRight_6_0= RULE_ID )
            {
            // InternalJavaSFT.g:4233:4: (lv_valNameRight_6_0= RULE_ID )
            // InternalJavaSFT.g:4234:5: lv_valNameRight_6_0= RULE_ID
            {
            lv_valNameRight_6_0=(Token)match(input,RULE_ID,FOLLOW_66); 

            					newLeafNode(lv_valNameRight_6_0, grammarAccess.getMinBinaireListValAccess().getValNameRightIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinBinaireListValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valNameRight",
            						lv_valNameRight_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,73,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMinBinaireListValAccess().getCollectCollectorsToListKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinBinaireListVal"


    // $ANTLR start "entryRuleMinBinaireListList"
    // InternalJavaSFT.g:4258:1: entryRuleMinBinaireListList returns [EObject current=null] : iv_ruleMinBinaireListList= ruleMinBinaireListList EOF ;
    public final EObject entryRuleMinBinaireListList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinBinaireListList = null;


        try {
            // InternalJavaSFT.g:4258:59: (iv_ruleMinBinaireListList= ruleMinBinaireListList EOF )
            // InternalJavaSFT.g:4259:2: iv_ruleMinBinaireListList= ruleMinBinaireListList EOF
            {
             newCompositeNode(grammarAccess.getMinBinaireListListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinBinaireListList=ruleMinBinaireListList();

            state._fsp--;

             current =iv_ruleMinBinaireListList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinBinaireListList"


    // $ANTLR start "ruleMinBinaireListList"
    // InternalJavaSFT.g:4265:1: ruleMinBinaireListList returns [EObject current=null] : ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->Math.min(' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i),' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i))).collect(Collectors.toList());' ) ;
    public final EObject ruleMinBinaireListList() throws RecognitionException {
        EObject current = null;

        Token lv_listNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_SIZEVAR_7=null;
        Token otherlv_8=null;
        Token lv_listNameRight_9_0=null;
        Token otherlv_10=null;
        Token lv_listNameRight2_11_0=null;
        Token otherlv_12=null;
        EObject lv_typeListLeft_0_0 = null;

        EObject lv_typeListRight_4_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:4271:2: ( ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->Math.min(' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i),' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i))).collect(Collectors.toList());' ) )
            // InternalJavaSFT.g:4272:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->Math.min(' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i),' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i))).collect(Collectors.toList());' )
            {
            // InternalJavaSFT.g:4272:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->Math.min(' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i),' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i))).collect(Collectors.toList());' )
            // InternalJavaSFT.g:4273:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->Math.min(' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i),' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i))).collect(Collectors.toList());'
            {
            // InternalJavaSFT.g:4273:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:4274:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:4274:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            // InternalJavaSFT.g:4275:5: lv_typeListLeft_0_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getMinBinaireListListAccess().getTypeListLeftTypeListNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListLeft_0_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinBinaireListListRule());
            					}
            					set(
            						current,
            						"typeListLeft",
            						lv_typeListLeft_0_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:4292:3: ( (lv_listNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:4293:4: (lv_listNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:4293:4: (lv_listNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:4294:5: lv_listNameLeft_1_0= RULE_ID
            {
            lv_listNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_listNameLeft_1_0, grammarAccess.getMinBinaireListListAccess().getListNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinBinaireListListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameLeft",
            						lv_listNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getMinBinaireListListAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getMinBinaireListListAccess().getLeftParenthesisKeyword_3());
            		
            // InternalJavaSFT.g:4318:3: ( (lv_typeListRight_4_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:4319:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:4319:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            // InternalJavaSFT.g:4320:5: lv_typeListRight_4_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getMinBinaireListListAccess().getTypeListRightTypeListNumberParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_typeListRight_4_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinBinaireListListRule());
            					}
            					set(
            						current,
            						"typeListRight",
            						lv_typeListRight_4_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_52); 

            			newLeafNode(otherlv_5, grammarAccess.getMinBinaireListListAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,59,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getMinBinaireListListAccess().getIntStreamRange0Keyword_6());
            		
            this_SIZEVAR_7=(Token)match(input,RULE_SIZEVAR,FOLLOW_67); 

            			newLeafNode(this_SIZEVAR_7, grammarAccess.getMinBinaireListListAccess().getSIZEVARTerminalRuleCall_7());
            		
            otherlv_8=(Token)match(input,74,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getMinBinaireListListAccess().getMapToObjIMathMinKeyword_8());
            		
            // InternalJavaSFT.g:4353:3: ( (lv_listNameRight_9_0= RULE_ID ) )
            // InternalJavaSFT.g:4354:4: (lv_listNameRight_9_0= RULE_ID )
            {
            // InternalJavaSFT.g:4354:4: (lv_listNameRight_9_0= RULE_ID )
            // InternalJavaSFT.g:4355:5: lv_listNameRight_9_0= RULE_ID
            {
            lv_listNameRight_9_0=(Token)match(input,RULE_ID,FOLLOW_68); 

            					newLeafNode(lv_listNameRight_9_0, grammarAccess.getMinBinaireListListAccess().getListNameRightIDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinBinaireListListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_9_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_10=(Token)match(input,75,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getMinBinaireListListAccess().getGetIKeyword_10());
            		
            // InternalJavaSFT.g:4375:3: ( (lv_listNameRight2_11_0= RULE_ID ) )
            // InternalJavaSFT.g:4376:4: (lv_listNameRight2_11_0= RULE_ID )
            {
            // InternalJavaSFT.g:4376:4: (lv_listNameRight2_11_0= RULE_ID )
            // InternalJavaSFT.g:4377:5: lv_listNameRight2_11_0= RULE_ID
            {
            lv_listNameRight2_11_0=(Token)match(input,RULE_ID,FOLLOW_69); 

            					newLeafNode(lv_listNameRight2_11_0, grammarAccess.getMinBinaireListListAccess().getListNameRight2IDTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinBinaireListListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight2",
            						lv_listNameRight2_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_12=(Token)match(input,76,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMinBinaireListListAccess().getGetICollectCollectorsToListKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinBinaireListList"


    // $ANTLR start "entryRuleMinBinaireValVal"
    // InternalJavaSFT.g:4401:1: entryRuleMinBinaireValVal returns [EObject current=null] : iv_ruleMinBinaireValVal= ruleMinBinaireValVal EOF ;
    public final EObject entryRuleMinBinaireValVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinBinaireValVal = null;


        try {
            // InternalJavaSFT.g:4401:57: (iv_ruleMinBinaireValVal= ruleMinBinaireValVal EOF )
            // InternalJavaSFT.g:4402:2: iv_ruleMinBinaireValVal= ruleMinBinaireValVal EOF
            {
             newCompositeNode(grammarAccess.getMinBinaireValValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMinBinaireValVal=ruleMinBinaireValVal();

            state._fsp--;

             current =iv_ruleMinBinaireValVal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinBinaireValVal"


    // $ANTLR start "ruleMinBinaireValVal"
    // InternalJavaSFT.g:4408:1: ruleMinBinaireValVal returns [EObject current=null] : ( ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Math.min(' ( (lv_varNameRight1_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_varNameRight2_6_0= RULE_ID ) ) otherlv_7= ')' ) ;
    public final EObject ruleMinBinaireValVal() throws RecognitionException {
        EObject current = null;

        Token lv_varNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_varNameRight1_4_0=null;
        Token otherlv_5=null;
        Token lv_varNameRight2_6_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_typeVarLeft_0_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:4414:2: ( ( ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Math.min(' ( (lv_varNameRight1_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_varNameRight2_6_0= RULE_ID ) ) otherlv_7= ')' ) )
            // InternalJavaSFT.g:4415:2: ( ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Math.min(' ( (lv_varNameRight1_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_varNameRight2_6_0= RULE_ID ) ) otherlv_7= ')' )
            {
            // InternalJavaSFT.g:4415:2: ( ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Math.min(' ( (lv_varNameRight1_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_varNameRight2_6_0= RULE_ID ) ) otherlv_7= ')' )
            // InternalJavaSFT.g:4416:3: ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Math.min(' ( (lv_varNameRight1_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_varNameRight2_6_0= RULE_ID ) ) otherlv_7= ')'
            {
            // InternalJavaSFT.g:4416:3: ( (lv_typeVarLeft_0_0= ruleTypeNumber ) )
            // InternalJavaSFT.g:4417:4: (lv_typeVarLeft_0_0= ruleTypeNumber )
            {
            // InternalJavaSFT.g:4417:4: (lv_typeVarLeft_0_0= ruleTypeNumber )
            // InternalJavaSFT.g:4418:5: lv_typeVarLeft_0_0= ruleTypeNumber
            {

            					newCompositeNode(grammarAccess.getMinBinaireValValAccess().getTypeVarLeftTypeNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeVarLeft_0_0=ruleTypeNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMinBinaireValValRule());
            					}
            					set(
            						current,
            						"typeVarLeft",
            						lv_typeVarLeft_0_0,
            						"projetIDM.JavaSFT.TypeNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:4435:3: ( (lv_varNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:4436:4: (lv_varNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:4436:4: (lv_varNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:4437:5: lv_varNameLeft_1_0= RULE_ID
            {
            lv_varNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_varNameLeft_1_0, grammarAccess.getMinBinaireValValAccess().getVarNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinBinaireValValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameLeft",
            						lv_varNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getMinBinaireValValAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,77,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getMinBinaireValValAccess().getMathMinKeyword_3());
            		
            // InternalJavaSFT.g:4461:3: ( (lv_varNameRight1_4_0= RULE_ID ) )
            // InternalJavaSFT.g:4462:4: (lv_varNameRight1_4_0= RULE_ID )
            {
            // InternalJavaSFT.g:4462:4: (lv_varNameRight1_4_0= RULE_ID )
            // InternalJavaSFT.g:4463:5: lv_varNameRight1_4_0= RULE_ID
            {
            lv_varNameRight1_4_0=(Token)match(input,RULE_ID,FOLLOW_71); 

            					newLeafNode(lv_varNameRight1_4_0, grammarAccess.getMinBinaireValValAccess().getVarNameRight1IDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinBinaireValValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameRight1",
            						lv_varNameRight1_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getMinBinaireValValAccess().getCommaKeyword_5());
            		
            // InternalJavaSFT.g:4483:3: ( (lv_varNameRight2_6_0= RULE_ID ) )
            // InternalJavaSFT.g:4484:4: (lv_varNameRight2_6_0= RULE_ID )
            {
            // InternalJavaSFT.g:4484:4: (lv_varNameRight2_6_0= RULE_ID )
            // InternalJavaSFT.g:4485:5: lv_varNameRight2_6_0= RULE_ID
            {
            lv_varNameRight2_6_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_varNameRight2_6_0, grammarAccess.getMinBinaireValValAccess().getVarNameRight2IDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMinBinaireValValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameRight2",
            						lv_varNameRight2_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMinBinaireValValAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinBinaireValVal"


    // $ANTLR start "entryRuleMaxBinaire"
    // InternalJavaSFT.g:4509:1: entryRuleMaxBinaire returns [EObject current=null] : iv_ruleMaxBinaire= ruleMaxBinaire EOF ;
    public final EObject entryRuleMaxBinaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxBinaire = null;


        try {
            // InternalJavaSFT.g:4509:51: (iv_ruleMaxBinaire= ruleMaxBinaire EOF )
            // InternalJavaSFT.g:4510:2: iv_ruleMaxBinaire= ruleMaxBinaire EOF
            {
             newCompositeNode(grammarAccess.getMaxBinaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxBinaire=ruleMaxBinaire();

            state._fsp--;

             current =iv_ruleMaxBinaire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxBinaire"


    // $ANTLR start "ruleMaxBinaire"
    // InternalJavaSFT.g:4516:1: ruleMaxBinaire returns [EObject current=null] : (this_MaxBinaireListVal_0= ruleMaxBinaireListVal | this_MaxBinaireListList_1= ruleMaxBinaireListList | this_MaxBinaireValVal_2= ruleMaxBinaireValVal ) ;
    public final EObject ruleMaxBinaire() throws RecognitionException {
        EObject current = null;

        EObject this_MaxBinaireListVal_0 = null;

        EObject this_MaxBinaireListList_1 = null;

        EObject this_MaxBinaireValVal_2 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:4522:2: ( (this_MaxBinaireListVal_0= ruleMaxBinaireListVal | this_MaxBinaireListList_1= ruleMaxBinaireListList | this_MaxBinaireValVal_2= ruleMaxBinaireValVal ) )
            // InternalJavaSFT.g:4523:2: (this_MaxBinaireListVal_0= ruleMaxBinaireListVal | this_MaxBinaireListList_1= ruleMaxBinaireListList | this_MaxBinaireValVal_2= ruleMaxBinaireValVal )
            {
            // InternalJavaSFT.g:4523:2: (this_MaxBinaireListVal_0= ruleMaxBinaireListVal | this_MaxBinaireListList_1= ruleMaxBinaireListList | this_MaxBinaireValVal_2= ruleMaxBinaireValVal )
            int alt20=3;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalJavaSFT.g:4524:3: this_MaxBinaireListVal_0= ruleMaxBinaireListVal
                    {

                    			newCompositeNode(grammarAccess.getMaxBinaireAccess().getMaxBinaireListValParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxBinaireListVal_0=ruleMaxBinaireListVal();

                    state._fsp--;


                    			current = this_MaxBinaireListVal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJavaSFT.g:4533:3: this_MaxBinaireListList_1= ruleMaxBinaireListList
                    {

                    			newCompositeNode(grammarAccess.getMaxBinaireAccess().getMaxBinaireListListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxBinaireListList_1=ruleMaxBinaireListList();

                    state._fsp--;


                    			current = this_MaxBinaireListList_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJavaSFT.g:4542:3: this_MaxBinaireValVal_2= ruleMaxBinaireValVal
                    {

                    			newCompositeNode(grammarAccess.getMaxBinaireAccess().getMaxBinaireValValParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxBinaireValVal_2=ruleMaxBinaireValVal();

                    state._fsp--;


                    			current = this_MaxBinaireValVal_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxBinaire"


    // $ANTLR start "entryRuleMaxBinaireListVal"
    // InternalJavaSFT.g:4554:1: entryRuleMaxBinaireListVal returns [EObject current=null] : iv_ruleMaxBinaireListVal= ruleMaxBinaireListVal EOF ;
    public final EObject entryRuleMaxBinaireListVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxBinaireListVal = null;


        try {
            // InternalJavaSFT.g:4554:58: (iv_ruleMaxBinaireListVal= ruleMaxBinaireListVal EOF )
            // InternalJavaSFT.g:4555:2: iv_ruleMaxBinaireListVal= ruleMaxBinaireListVal EOF
            {
             newCompositeNode(grammarAccess.getMaxBinaireListValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxBinaireListVal=ruleMaxBinaireListVal();

            state._fsp--;

             current =iv_ruleMaxBinaireListVal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxBinaireListVal"


    // $ANTLR start "ruleMaxBinaireListVal"
    // InternalJavaSFT.g:4561:1: ruleMaxBinaireListVal returns [EObject current=null] : ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->Math.max(e,' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ')).collect(Collectors.toList());' ) ;
    public final EObject ruleMaxBinaireListVal() throws RecognitionException {
        EObject current = null;

        Token lv_listNameLeft_1_0=null;
        Token otherlv_2=null;
        Token lv_listNameRight_4_0=null;
        Token otherlv_5=null;
        Token lv_valNameRight_6_0=null;
        Token otherlv_7=null;
        EObject lv_typeListLeft_0_0 = null;

        EObject lv_typeListRight_3_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:4567:2: ( ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->Math.max(e,' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ')).collect(Collectors.toList());' ) )
            // InternalJavaSFT.g:4568:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->Math.max(e,' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ')).collect(Collectors.toList());' )
            {
            // InternalJavaSFT.g:4568:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->Math.max(e,' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ')).collect(Collectors.toList());' )
            // InternalJavaSFT.g:4569:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_typeListRight_3_0= ruleTypeListNumber ) ) ( (lv_listNameRight_4_0= RULE_ID ) ) otherlv_5= '.stream().map(e->Math.max(e,' ( (lv_valNameRight_6_0= RULE_ID ) ) otherlv_7= ')).collect(Collectors.toList());'
            {
            // InternalJavaSFT.g:4569:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:4570:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:4570:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            // InternalJavaSFT.g:4571:5: lv_typeListLeft_0_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getMaxBinaireListValAccess().getTypeListLeftTypeListNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListLeft_0_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxBinaireListValRule());
            					}
            					set(
            						current,
            						"typeListLeft",
            						lv_typeListLeft_0_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:4588:3: ( (lv_listNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:4589:4: (lv_listNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:4589:4: (lv_listNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:4590:5: lv_listNameLeft_1_0= RULE_ID
            {
            lv_listNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_listNameLeft_1_0, grammarAccess.getMaxBinaireListValAccess().getListNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxBinaireListValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameLeft",
            						lv_listNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getMaxBinaireListValAccess().getEqualsSignKeyword_2());
            		
            // InternalJavaSFT.g:4610:3: ( (lv_typeListRight_3_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:4611:4: (lv_typeListRight_3_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:4611:4: (lv_typeListRight_3_0= ruleTypeListNumber )
            // InternalJavaSFT.g:4612:5: lv_typeListRight_3_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getMaxBinaireListValAccess().getTypeListRightTypeListNumberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListRight_3_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxBinaireListValRule());
            					}
            					set(
            						current,
            						"typeListRight",
            						lv_typeListRight_3_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:4629:3: ( (lv_listNameRight_4_0= RULE_ID ) )
            // InternalJavaSFT.g:4630:4: (lv_listNameRight_4_0= RULE_ID )
            {
            // InternalJavaSFT.g:4630:4: (lv_listNameRight_4_0= RULE_ID )
            // InternalJavaSFT.g:4631:5: lv_listNameRight_4_0= RULE_ID
            {
            lv_listNameRight_4_0=(Token)match(input,RULE_ID,FOLLOW_72); 

            					newLeafNode(lv_listNameRight_4_0, grammarAccess.getMaxBinaireListValAccess().getListNameRightIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxBinaireListValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,78,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getMaxBinaireListValAccess().getStreamMapEMathMaxEKeyword_5());
            		
            // InternalJavaSFT.g:4651:3: ( (lv_valNameRight_6_0= RULE_ID ) )
            // InternalJavaSFT.g:4652:4: (lv_valNameRight_6_0= RULE_ID )
            {
            // InternalJavaSFT.g:4652:4: (lv_valNameRight_6_0= RULE_ID )
            // InternalJavaSFT.g:4653:5: lv_valNameRight_6_0= RULE_ID
            {
            lv_valNameRight_6_0=(Token)match(input,RULE_ID,FOLLOW_66); 

            					newLeafNode(lv_valNameRight_6_0, grammarAccess.getMaxBinaireListValAccess().getValNameRightIDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxBinaireListValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"valNameRight",
            						lv_valNameRight_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,73,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMaxBinaireListValAccess().getCollectCollectorsToListKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxBinaireListVal"


    // $ANTLR start "entryRuleMaxBinaireListList"
    // InternalJavaSFT.g:4677:1: entryRuleMaxBinaireListList returns [EObject current=null] : iv_ruleMaxBinaireListList= ruleMaxBinaireListList EOF ;
    public final EObject entryRuleMaxBinaireListList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxBinaireListList = null;


        try {
            // InternalJavaSFT.g:4677:59: (iv_ruleMaxBinaireListList= ruleMaxBinaireListList EOF )
            // InternalJavaSFT.g:4678:2: iv_ruleMaxBinaireListList= ruleMaxBinaireListList EOF
            {
             newCompositeNode(grammarAccess.getMaxBinaireListListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxBinaireListList=ruleMaxBinaireListList();

            state._fsp--;

             current =iv_ruleMaxBinaireListList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxBinaireListList"


    // $ANTLR start "ruleMaxBinaireListList"
    // InternalJavaSFT.g:4684:1: ruleMaxBinaireListList returns [EObject current=null] : ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->Math.max(' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i),' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i))).collect(Collectors.toList());' ) ;
    public final EObject ruleMaxBinaireListList() throws RecognitionException {
        EObject current = null;

        Token lv_listNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_SIZEVAR_7=null;
        Token otherlv_8=null;
        Token lv_listNameRight_9_0=null;
        Token otherlv_10=null;
        Token lv_listNameRight2_11_0=null;
        Token otherlv_12=null;
        EObject lv_typeListLeft_0_0 = null;

        EObject lv_typeListRight_4_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:4690:2: ( ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->Math.max(' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i),' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i))).collect(Collectors.toList());' ) )
            // InternalJavaSFT.g:4691:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->Math.max(' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i),' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i))).collect(Collectors.toList());' )
            {
            // InternalJavaSFT.g:4691:2: ( ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->Math.max(' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i),' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i))).collect(Collectors.toList());' )
            // InternalJavaSFT.g:4692:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) ) ( (lv_listNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_typeListRight_4_0= ruleTypeListNumber ) ) otherlv_5= ')' otherlv_6= 'IntStream.range(0,' this_SIZEVAR_7= RULE_SIZEVAR otherlv_8= ').mapToObj(i->Math.max(' ( (lv_listNameRight_9_0= RULE_ID ) ) otherlv_10= '.get(i),' ( (lv_listNameRight2_11_0= RULE_ID ) ) otherlv_12= '.get(i))).collect(Collectors.toList());'
            {
            // InternalJavaSFT.g:4692:3: ( (lv_typeListLeft_0_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:4693:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:4693:4: (lv_typeListLeft_0_0= ruleTypeListNumber )
            // InternalJavaSFT.g:4694:5: lv_typeListLeft_0_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getMaxBinaireListListAccess().getTypeListLeftTypeListNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeListLeft_0_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxBinaireListListRule());
            					}
            					set(
            						current,
            						"typeListLeft",
            						lv_typeListLeft_0_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:4711:3: ( (lv_listNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:4712:4: (lv_listNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:4712:4: (lv_listNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:4713:5: lv_listNameLeft_1_0= RULE_ID
            {
            lv_listNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_listNameLeft_1_0, grammarAccess.getMaxBinaireListListAccess().getListNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxBinaireListListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameLeft",
            						lv_listNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getMaxBinaireListListAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getMaxBinaireListListAccess().getLeftParenthesisKeyword_3());
            		
            // InternalJavaSFT.g:4737:3: ( (lv_typeListRight_4_0= ruleTypeListNumber ) )
            // InternalJavaSFT.g:4738:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            {
            // InternalJavaSFT.g:4738:4: (lv_typeListRight_4_0= ruleTypeListNumber )
            // InternalJavaSFT.g:4739:5: lv_typeListRight_4_0= ruleTypeListNumber
            {

            					newCompositeNode(grammarAccess.getMaxBinaireListListAccess().getTypeListRightTypeListNumberParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_typeListRight_4_0=ruleTypeListNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxBinaireListListRule());
            					}
            					set(
            						current,
            						"typeListRight",
            						lv_typeListRight_4_0,
            						"projetIDM.JavaSFT.TypeListNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,33,FOLLOW_52); 

            			newLeafNode(otherlv_5, grammarAccess.getMaxBinaireListListAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,59,FOLLOW_27); 

            			newLeafNode(otherlv_6, grammarAccess.getMaxBinaireListListAccess().getIntStreamRange0Keyword_6());
            		
            this_SIZEVAR_7=(Token)match(input,RULE_SIZEVAR,FOLLOW_73); 

            			newLeafNode(this_SIZEVAR_7, grammarAccess.getMaxBinaireListListAccess().getSIZEVARTerminalRuleCall_7());
            		
            otherlv_8=(Token)match(input,79,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getMaxBinaireListListAccess().getMapToObjIMathMaxKeyword_8());
            		
            // InternalJavaSFT.g:4772:3: ( (lv_listNameRight_9_0= RULE_ID ) )
            // InternalJavaSFT.g:4773:4: (lv_listNameRight_9_0= RULE_ID )
            {
            // InternalJavaSFT.g:4773:4: (lv_listNameRight_9_0= RULE_ID )
            // InternalJavaSFT.g:4774:5: lv_listNameRight_9_0= RULE_ID
            {
            lv_listNameRight_9_0=(Token)match(input,RULE_ID,FOLLOW_68); 

            					newLeafNode(lv_listNameRight_9_0, grammarAccess.getMaxBinaireListListAccess().getListNameRightIDTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxBinaireListListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight",
            						lv_listNameRight_9_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_10=(Token)match(input,75,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getMaxBinaireListListAccess().getGetIKeyword_10());
            		
            // InternalJavaSFT.g:4794:3: ( (lv_listNameRight2_11_0= RULE_ID ) )
            // InternalJavaSFT.g:4795:4: (lv_listNameRight2_11_0= RULE_ID )
            {
            // InternalJavaSFT.g:4795:4: (lv_listNameRight2_11_0= RULE_ID )
            // InternalJavaSFT.g:4796:5: lv_listNameRight2_11_0= RULE_ID
            {
            lv_listNameRight2_11_0=(Token)match(input,RULE_ID,FOLLOW_69); 

            					newLeafNode(lv_listNameRight2_11_0, grammarAccess.getMaxBinaireListListAccess().getListNameRight2IDTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxBinaireListListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"listNameRight2",
            						lv_listNameRight2_11_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_12=(Token)match(input,76,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getMaxBinaireListListAccess().getGetICollectCollectorsToListKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxBinaireListList"


    // $ANTLR start "entryRuleMaxBinaireValVal"
    // InternalJavaSFT.g:4820:1: entryRuleMaxBinaireValVal returns [EObject current=null] : iv_ruleMaxBinaireValVal= ruleMaxBinaireValVal EOF ;
    public final EObject entryRuleMaxBinaireValVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxBinaireValVal = null;


        try {
            // InternalJavaSFT.g:4820:57: (iv_ruleMaxBinaireValVal= ruleMaxBinaireValVal EOF )
            // InternalJavaSFT.g:4821:2: iv_ruleMaxBinaireValVal= ruleMaxBinaireValVal EOF
            {
             newCompositeNode(grammarAccess.getMaxBinaireValValRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxBinaireValVal=ruleMaxBinaireValVal();

            state._fsp--;

             current =iv_ruleMaxBinaireValVal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxBinaireValVal"


    // $ANTLR start "ruleMaxBinaireValVal"
    // InternalJavaSFT.g:4827:1: ruleMaxBinaireValVal returns [EObject current=null] : ( ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Math.max(' ( (lv_varNameRight1_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_varNameRight2_6_0= RULE_ID ) ) otherlv_7= ')' ) ;
    public final EObject ruleMaxBinaireValVal() throws RecognitionException {
        EObject current = null;

        Token lv_varNameLeft_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_varNameRight1_4_0=null;
        Token otherlv_5=null;
        Token lv_varNameRight2_6_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_typeVarLeft_0_0 = null;



        	enterRule();

        try {
            // InternalJavaSFT.g:4833:2: ( ( ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Math.max(' ( (lv_varNameRight1_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_varNameRight2_6_0= RULE_ID ) ) otherlv_7= ')' ) )
            // InternalJavaSFT.g:4834:2: ( ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Math.max(' ( (lv_varNameRight1_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_varNameRight2_6_0= RULE_ID ) ) otherlv_7= ')' )
            {
            // InternalJavaSFT.g:4834:2: ( ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Math.max(' ( (lv_varNameRight1_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_varNameRight2_6_0= RULE_ID ) ) otherlv_7= ')' )
            // InternalJavaSFT.g:4835:3: ( (lv_typeVarLeft_0_0= ruleTypeNumber ) ) ( (lv_varNameLeft_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= 'Math.max(' ( (lv_varNameRight1_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_varNameRight2_6_0= RULE_ID ) ) otherlv_7= ')'
            {
            // InternalJavaSFT.g:4835:3: ( (lv_typeVarLeft_0_0= ruleTypeNumber ) )
            // InternalJavaSFT.g:4836:4: (lv_typeVarLeft_0_0= ruleTypeNumber )
            {
            // InternalJavaSFT.g:4836:4: (lv_typeVarLeft_0_0= ruleTypeNumber )
            // InternalJavaSFT.g:4837:5: lv_typeVarLeft_0_0= ruleTypeNumber
            {

            					newCompositeNode(grammarAccess.getMaxBinaireValValAccess().getTypeVarLeftTypeNumberParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_typeVarLeft_0_0=ruleTypeNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxBinaireValValRule());
            					}
            					set(
            						current,
            						"typeVarLeft",
            						lv_typeVarLeft_0_0,
            						"projetIDM.JavaSFT.TypeNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJavaSFT.g:4854:3: ( (lv_varNameLeft_1_0= RULE_ID ) )
            // InternalJavaSFT.g:4855:4: (lv_varNameLeft_1_0= RULE_ID )
            {
            // InternalJavaSFT.g:4855:4: (lv_varNameLeft_1_0= RULE_ID )
            // InternalJavaSFT.g:4856:5: lv_varNameLeft_1_0= RULE_ID
            {
            lv_varNameLeft_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_varNameLeft_1_0, grammarAccess.getMaxBinaireValValAccess().getVarNameLeftIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxBinaireValValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameLeft",
            						lv_varNameLeft_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_74); 

            			newLeafNode(otherlv_2, grammarAccess.getMaxBinaireValValAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,80,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getMaxBinaireValValAccess().getMathMaxKeyword_3());
            		
            // InternalJavaSFT.g:4880:3: ( (lv_varNameRight1_4_0= RULE_ID ) )
            // InternalJavaSFT.g:4881:4: (lv_varNameRight1_4_0= RULE_ID )
            {
            // InternalJavaSFT.g:4881:4: (lv_varNameRight1_4_0= RULE_ID )
            // InternalJavaSFT.g:4882:5: lv_varNameRight1_4_0= RULE_ID
            {
            lv_varNameRight1_4_0=(Token)match(input,RULE_ID,FOLLOW_71); 

            					newLeafNode(lv_varNameRight1_4_0, grammarAccess.getMaxBinaireValValAccess().getVarNameRight1IDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxBinaireValValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameRight1",
            						lv_varNameRight1_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,37,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getMaxBinaireValValAccess().getCommaKeyword_5());
            		
            // InternalJavaSFT.g:4902:3: ( (lv_varNameRight2_6_0= RULE_ID ) )
            // InternalJavaSFT.g:4903:4: (lv_varNameRight2_6_0= RULE_ID )
            {
            // InternalJavaSFT.g:4903:4: (lv_varNameRight2_6_0= RULE_ID )
            // InternalJavaSFT.g:4904:5: lv_varNameRight2_6_0= RULE_ID
            {
            lv_varNameRight2_6_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_varNameRight2_6_0, grammarAccess.getMaxBinaireValValAccess().getVarNameRight2IDTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxBinaireValValRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varNameRight2",
            						lv_varNameRight2_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMaxBinaireValValAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxBinaireValVal"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\1\6\3\11\1\6\2\43\2\22\1\uffff\3\11\1\uffff\2\52\1\43\2\21\1\6\2\22\1\41\1\11";
    static final String dfa_3s = "\1\21\3\11\1\10\2\43\2\22\1\uffff\1\120\2\11\1\uffff\1\107\1\77\1\43\1\56\1\21\1\10\2\22\1\41\1\73";
    static final String dfa_4s = "\11\uffff\1\2\3\uffff\1\1\12\uffff";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\1\3\1\1\1\2\10\uffff\1\4",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\11\1\7\1\10",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\14",
            "",
            "\1\16\42\uffff\2\15\2\uffff\1\15\1\uffff\1\15\1\uffff\1\15\1\uffff\1\15\1\uffff\1\15\24\uffff\1\11\2\uffff\1\11",
            "\1\17",
            "\1\20",
            "",
            "\2\15\23\uffff\1\11\2\uffff\1\11\4\uffff\1\11",
            "\1\15\24\uffff\1\11",
            "\1\21",
            "\1\11\34\uffff\1\22",
            "\1\23",
            "\1\11\1\24\1\25",
            "\1\26",
            "\1\26",
            "\1\27",
            "\1\15\61\uffff\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1054:2: (this_OperationUnaire_0= ruleOperationUnaire | this_OperationBinaire_1= ruleOperationBinaire )";
        }
    }
    static final String dfa_7s = "\34\uffff";
    static final String dfa_8s = "\1\6\2\11\1\uffff\1\7\1\43\2\22\2\11\1\52\7\uffff\1\43\1\uffff\1\56\1\21\1\7\2\22\1\41\1\11\1\57";
    static final String dfa_9s = "\1\21\2\11\1\uffff\1\10\1\43\2\22\1\70\1\11\1\53\7\uffff\1\43\1\uffff\1\56\1\21\1\10\2\22\1\41\1\11\1\67";
    static final String dfa_10s = "\3\uffff\1\1\7\uffff\1\4\1\7\1\11\1\3\1\5\1\6\1\10\1\uffff\1\2\10\uffff";
    static final String dfa_11s = "\34\uffff}>";
    static final String[] dfa_12s = {
            "\1\3\1\1\1\2\10\uffff\1\4",
            "\1\5",
            "\1\5",
            "",
            "\1\6\1\7",
            "\1\10",
            "\1\11",
            "\1\11",
            "\1\12\42\uffff\1\16\1\13\2\uffff\1\17\1\uffff\1\20\1\uffff\1\14\1\uffff\1\21\1\uffff\1\15",
            "\1\22",
            "\1\3\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24",
            "",
            "\1\25",
            "\1\26",
            "\1\27\1\30",
            "\1\31",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\17\1\uffff\1\20\1\uffff\1\14\1\uffff\1\21\1\uffff\1\15"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1090:2: (this_SumUnaire_0= ruleSumUnaire | this_ProductUnaire_1= ruleProductUnaire | this_MinUnaire_2= ruleMinUnaire | this_MaxUnaire_3= ruleMaxUnaire | this_OppositeUnaire_4= ruleOppositeUnaire | this_CosUnaire_5= ruleCosUnaire | this_SinUnaire_6= ruleSinUnaire | this_SqrtUnaire_7= ruleSqrtUnaire | this_ExpUnaire_8= ruleExpUnaire )";
        }
    }
    static final String dfa_13s = "\40\uffff";
    static final String dfa_14s = "\2\6\2\11\1\uffff\2\22\1\43\2\11\1\43\1\uffff\1\77\1\uffff\1\21\2\uffff\1\6\1\21\2\22\1\6\1\11\2\22\1\71\1\41\1\73\1\13\1\74\1\11\1\75";
    static final String dfa_15s = "\1\21\1\10\2\11\1\uffff\2\22\1\43\1\11\1\120\1\43\1\uffff\1\107\1\uffff\1\56\2\uffff\1\10\1\21\2\22\1\10\1\11\2\22\1\116\1\41\1\73\1\13\1\117\1\11\1\106";
    static final String dfa_16s = "\4\uffff\1\1\6\uffff\1\5\1\uffff\1\4\1\uffff\1\2\1\3\17\uffff";
    static final String dfa_17s = "\40\uffff}>";
    static final String[] dfa_18s = {
            "\1\4\1\2\1\3\10\uffff\1\1",
            "\1\4\1\5\1\6",
            "\1\7",
            "\1\7",
            "",
            "\1\10",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\14\103\uffff\1\15\2\uffff\1\13",
            "\1\16",
            "",
            "\1\4\2\uffff\1\17\4\uffff\1\20",
            "",
            "\1\21\34\uffff\1\22",
            "",
            "",
            "\1\4\1\23\1\24",
            "\1\25",
            "\1\26",
            "\1\26",
            "\1\4\1\27\1\30",
            "\1\31",
            "\1\32",
            "\1\32",
            "\1\4\6\uffff\1\17\2\uffff\2\20\3\uffff\1\15\5\uffff\1\13",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36\15\uffff\1\15\4\uffff\1\13",
            "\1\37",
            "\1\4\3\uffff\1\17\4\uffff\1\20"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1189:2: (this_SumBinaire_0= ruleSumBinaire | this_ProductBinaire_1= ruleProductBinaire | this_DivisionBinaire_2= ruleDivisionBinaire | this_MinBinaire_3= ruleMinBinaire | this_MaxBinaire_4= ruleMaxBinaire )";
        }
    }
    static final String dfa_19s = "\13\uffff";
    static final String dfa_20s = "\2\6\1\uffff\3\22\1\11\1\43\1\21\2\uffff";
    static final String dfa_21s = "\1\21\1\10\1\uffff\3\22\1\11\1\43\1\56\2\uffff";
    static final String dfa_22s = "\2\uffff\1\3\6\uffff\1\2\1\1";
    static final String dfa_23s = "\13\uffff}>";
    static final String[] dfa_24s = {
            "\3\2\10\uffff\1\1",
            "\1\5\1\3\1\4",
            "",
            "\1\6",
            "\1\6",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\12\34\uffff\1\11",
            "",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "2739:2: (this_SumBinaireListVal_0= ruleSumBinaireListVal | this_SumBinaireListList_1= ruleSumBinaireListList | this_SumBinaireValVal_2= ruleSumBinaireValVal )";
        }
    }
    static final String dfa_25s = "\12\uffff";
    static final String dfa_26s = "\2\7\1\uffff\2\22\1\11\1\43\1\21\2\uffff";
    static final String dfa_27s = "\1\21\1\10\1\uffff\2\22\1\11\1\43\1\56\2\uffff";
    static final String dfa_28s = "\2\uffff\1\3\5\uffff\1\1\1\2";
    static final String dfa_29s = "\12\uffff}>";
    static final String[] dfa_30s = {
            "\2\2\10\uffff\1\1",
            "\1\3\1\4",
            "",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10\34\uffff\1\11",
            "",
            ""
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_28;
            this.special = dfa_29;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "3150:2: (this_ProductBinaireListVal_0= ruleProductBinaireListVal | this_ProductBinaireListList_1= ruleProductBinaireListList | this_ProductBinaireValVal_2= ruleProductBinaireValVal )";
        }
    }
    static final String dfa_31s = "\20\uffff";
    static final String dfa_32s = "\2\7\1\uffff\2\22\1\11\1\43\1\21\1\7\1\uffff\2\22\1\11\1\103\2\uffff";
    static final String dfa_33s = "\1\21\1\10\1\uffff\2\22\1\11\1\43\1\56\1\10\1\uffff\2\22\1\11\1\104\2\uffff";
    static final String dfa_34s = "\2\uffff\1\4\6\uffff\1\3\4\uffff\1\1\1\2";
    static final String dfa_35s = "\20\uffff}>";
    static final String[] dfa_36s = {
            "\2\2\10\uffff\1\1",
            "\1\3\1\4",
            "",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10\34\uffff\1\11",
            "\1\12\1\13",
            "",
            "\1\14",
            "\1\14",
            "\1\15",
            "\1\16\1\17",
            "",
            ""
    };

    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[][] dfa_36 = unpackEncodedStringArray(dfa_36s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_31;
            this.eof = dfa_31;
            this.min = dfa_32;
            this.max = dfa_33;
            this.accept = dfa_34;
            this.special = dfa_35;
            this.transition = dfa_36;
        }
        public String getDescription() {
            return "3561:2: (this_DivisionBinaireListVal_0= ruleDivisionBinaireListVal | this_DivisionBinaireValList_1= ruleDivisionBinaireValList | this_DivisionBinaireListList_2= ruleDivisionBinaireListList | this_DivisionBinaireValVal_3= ruleDivisionBinaireValVal )";
        }
    }
    static final String dfa_37s = "\2\uffff\1\3\5\uffff\1\2\1\1";
    static final String[] dfa_38s = {
            "\2\2\10\uffff\1\1",
            "\1\3\1\4",
            "",
            "\1\5",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\11\34\uffff\1\10",
            "",
            ""
    };
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_37;
            this.special = dfa_29;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "4104:2: (this_MinBinaireListVal_0= ruleMinBinaireListVal | this_MinBinaireListList_1= ruleMinBinaireListList | this_MinBinaireValVal_2= ruleMinBinaireValVal )";
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_25;
            this.eof = dfa_25;
            this.min = dfa_26;
            this.max = dfa_27;
            this.accept = dfa_37;
            this.special = dfa_29;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "4523:2: (this_MaxBinaireListVal_0= ruleMaxBinaireListVal | this_MaxBinaireListList_1= ruleMaxBinaireListList | this_MaxBinaireValVal_2= ruleMaxBinaireValVal )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000400L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002200000400L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000140000201C0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});

}
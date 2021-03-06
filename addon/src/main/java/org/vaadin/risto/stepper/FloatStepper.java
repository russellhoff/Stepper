/**
 * 
 */
package org.vaadin.risto.stepper;

/**
 * <p>
 * Field that allows stepping through values via given up/down controls.
 * Supports values of type Float. Default value is 0.
 * </p>
 * 
 * <p>
 * Note: float incrementation IS NOT completely accurate, as the values are
 * always rounded. The accuracy should be enough for most use cases.
 * </p>
 * 
 * @author Risto Yrjänä / Vaadin }>
 * 
 */
public class FloatStepper extends AbstractDecimalStepper<Float>  {

    private static final long serialVersionUID = -5328027647865381265L;

    public FloatStepper() {
        super(0F,1.0F);
    }

    public FloatStepper(String caption) {
        this();
        setCaption(caption);
    }
    
   @Override
   public Class<Float> getType() {
	   return Float.class;
   }

   protected Float convertToValueType( Number parsedValue ) {
	   return parsedValue.floatValue();
   }

}

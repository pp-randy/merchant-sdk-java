
/**
 * Auto generated code
 */

package urn.ebay.api.PayPalAPI;

import urn.ebay.apis.eBLBaseComponents.AbstractRequestType;


/**
 * A timestamped token, the value of which was returned by
 * SetAuthFlowParam Response.
 * Required
 * Character length and limitations: 20 single-byte characters
 */
public class GetAccessPermissionDetailsRequestType extends AbstractRequestType{

	/**
	 * A timestamped token, the value of which was returned by
	 * SetAuthFlowParam Response.
	 * Required
	 * Character length and limitations: 20 single-byte characters
	 *
	 * @Required
	 */
	private String Token;
	public String getToken() {
		return Token;
	}
	public void setToken(String value) {
		this.Token = value;
	}


	public GetAccessPermissionDetailsRequestType(String Token) {
		this.Token = Token;
	}
	public GetAccessPermissionDetailsRequestType() {
	}

	public String toXMLString()  {
		StringBuilder sb = new StringBuilder();
sb.append(super.toXMLString());
		if( Token != null ) {
			sb.append("<ebl:Token>").append(Token);
			sb.append("</ebl:Token>");
		}
		return sb.toString();
	}

}
